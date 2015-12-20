package lostandfound;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author LIA
 */
public class BarangController {
    
    private Connection connection;
    private String username = "lostandfound";
    private String password = "007";
    DatabaseConnection connect;
    private Statement sqlQuery;
    private ResultSet sqlResult;

    public void start() {
        this.connect = new DatabaseConnection(username, password);
    }
    
    
    public boolean tambahBarang(String namaBarang, String jenisBarang, String tglDitemukan, 
            String ket, String namaPenemu, String noKtp, String noTelepon){

        //validate date
        Calendar cal= Calendar.getInstance();
        int today = cal.get(Calendar.DAY_OF_MONTH);
        int thisMonth = cal.get(Calendar.MONTH)+1;
        int thisYear = cal.get(Calendar.YEAR);
        
        String hariIni = ""+thisYear+"-"+thisMonth+"-"+today+"";
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        try {
            java.util.Date found = format.parse(tglDitemukan);
            java.util.Date date = format.parse(hariIni);
            int val = found.compareTo(date);
            
            if(val>0){
                JOptionPane.showMessageDialog(null, "Tanggal tidak bisa setelah hari ini!", "Pesan", WARNING_MESSAGE);
                return false;
            }        
        } catch (ParseException ex) {
            Logger.getLogger(TambahBarangView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean success;
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query = "insert into barang values (seq_barang.nextval, '"+ namaBarang+"', '"+jenisBarang+
                    "' , to_date('" +tglDitemukan +"', 'yyyy-MM-dd') , '"+ 
                    ket+"' , '"+ namaPenemu+"' , '"+ noKtp +"' , '"+ noTelepon+"',"+0+")";
            
            sqlQuery.executeQuery(query);
        }catch(SQLException ex){
            success= false;
            
            return success;
        }
        connect.disconnect();       
        success = true;
        return success;
        
    }
    
    public boolean ambilBarang(String nama, String noKtp, String tglMengambil, String noTelepon, String alamat, String idBarang){
        boolean success;
        start();
        
        //validate if date is BEFORE the item is found
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        try {
            sqlQuery = connect.getConnection().createStatement();
            String query = "select tgl_ditemukan from barang where id_barang = '"+idBarang+"'";
            sqlResult = sqlQuery.executeQuery(query);
            while(sqlResult.next()){
                String foundDate = sqlResult.getDate("TGL_DITEMUKAN").toString();
                java.util.Date found = format.parse(foundDate);
                java.util.Date take = format.parse(tglMengambil);
             
                if(take.before(found)){
                JOptionPane.showMessageDialog(null, "Barang tidak bisa diambil SEBELUM ditemukan! Cek kambali input tanggal Anda!",
                        "Pesan", WARNING_MESSAGE);
                return false;
                }else{
                    break;
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        String message;
        
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query1 = "insert into pemilik values(seq_pemilik.nextval, '"+nama+"', '"+noKtp+"', to_date('"+tglMengambil+"', 'yyyy-MM-dd'),'"
                    +noTelepon+"','"+alamat+"',"+idBarang+")";
            sqlQuery.executeQuery(query1);
            String query2 = "update Barang set status_pengambilan="+1+" where id_barang="+idBarang;
            
            sqlQuery.executeQuery(query2);
            success=true;
        }catch(SQLException e){
            message = "Maaf data gagal diinput!";
            success =false;
            return false;
        }
        connect.disconnect();
        return success;
    }    
    
    public ResultSet cariBarangHilang(String keyword, String kategori){
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query;
            if(keyword.isEmpty()){
                query = "select id_barang, nama_barang, jenis_barang, tgl_ditemukan, keterangan, nama_penemu, no_ktp, no_telepon "
                        + "from barang where jenis_barang='"+kategori+"' order by id_barang";
            }else{
                query = "select id_barang, nama_barang, jenis_barang, tgl_ditemukan, keterangan, nama_penemu, no_ktp, no_telepon "
                        + "from barang where nama_barang='"+keyword+"' and jenis_barang='"+kategori+"' order by id_barang";
            }
            sqlResult = sqlQuery.executeQuery(query);
            
        }catch(SQLException ex){
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        //connect.disconnect();
        return sqlResult;
    }
    
    public boolean cariBarangByID(String id) throws ParseException{
        boolean found=false;
        try{
            start();
            //Only God knows what the code below means...
            sqlQuery = connect.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            String query = "select * from barang where id_barang="+id+" and status_pengambilan='0'";
            sqlResult = sqlQuery.executeQuery(query);
            sqlResult.last();
            int row = sqlResult.getRow();
            sqlResult.beforeFirst();
            if(row==1){
                found=true;
            }
        }catch(SQLException e){
            found = false;
        }
        return found;
    }
    
    
    public ResultSet lihatBarangBelumDiambil(){
        
        try {
            sqlQuery = connect.getConnection().createStatement();
            String query = "select id_barang, nama_barang, jenis_barang, tgl_ditemukan, keterangan, nama_penemu, no_ktp, no_telepon "
                    + "from barang where status_pengambilan=0 order by id_barang";
            sqlResult = sqlQuery.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     
        return sqlResult;
    }
    
    
    public ResultSet lihatBarangSudahDiambil(){
        try {
            sqlQuery = connect.getConnection().createStatement();
            String query = "select b.id_barang, b.nama_barang, b.jenis_barang, b.tgl_ditemukan, "
                            + "b.keterangan, b.nama_penemu, b.no_ktp, b.no_telepon, "
                            + "p.nama_pemilik, p.no_ktp, p.tgl_mengambil, p.no_telepon, p.alamat"
                            + " from barang b, pemilik p " +
                            "where b.id_barang = p.id_barang and b.status_pengambilan = '1' order by id_barang";
            sqlResult = sqlQuery.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     
        return sqlResult;
    }
}
