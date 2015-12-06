package lostandfound;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    
    public boolean tambahBarang(String namaBarang, String jenisBarang, String tglDitemukan, String ket, String namaPenemu, String noKtp, String noTelepon){
        String message;
        boolean success;
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query = "insert into barang values (seq_barang.nextval, '"+ namaBarang+"', '"+jenisBarang+
                    "' , to_date('" +tglDitemukan +"', 'yyyy-MM-dd') , '"+ 
                    ket+"' , '"+ namaPenemu+"' , '"+ noKtp +"' , '"+ noTelepon+"',"+0+")";
            System.out.println("query input "+query);
            sqlQuery.executeQuery(query);
        }catch(SQLException ex){
            message = "Maaf data gagal diinput! "+ex.toString();
            success= false;
            System.out.println("message : "+message);
            return success;
        }
        
        connect.disconnect();
        message = "Data berhasil diinput!";
        success = true;
        return success;
        
    }
    
    public boolean ambilBarang(String nama, String noKtp, String tglMengambil, String noTelepon, String alamat, String idBarang){
        String message;
        boolean success;
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query = "insert into pemilik values(seq_pemilik.nextval, '"+nama+"', '"+noKtp+"', to_date('"+tglMengambil+"', 'yyyy-MM-dd'),'"
                    +noTelepon+"','"+alamat+"',"+idBarang+")";
            System.out.println("query 1 : "+query);
            sqlQuery.executeQuery(query);
            query = "update Barang set status_pengambilan="+1+" where id_barang="+idBarang;
            System.out.println("query 2 : "+query);
            sqlQuery.executeQuery(query);
            success=true;
        }catch(SQLException e){
            message = "Maaf data gagal diinput!";
            System.out.println("message : "+message);
            success =false;
            return false;
        }
        
        connect.disconnect();
        message = "Data berhasil diinput!";
        return success;
    }
    
    public ResultSet lihatBarangHilang(){
        
        try {
            sqlQuery = connect.getConnection().createStatement();
            String query = "select id_barang, nama_barang, jenis_barang, tgl_ditemukan, keterangan, nama_penemu, no_ktp, no_telepon "
                    + "from barang where status_pengambilan=0";
            sqlResult = sqlQuery.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     
        return sqlResult;
    }
    
    public ResultSet cariBarangHilang(String keyword, String kategori){
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query;
            if(keyword.isEmpty()){
                query = "select id_barang, nama_barang, jenis_barang, tgl_ditemukan, keterangan, nama_penemu, no_ktp, no_telepon "
                        + "from barang where jenis_barang='"+kategori+"'";
            }else{
                query = "select id_barang, nama_barang, jenis_barang, tgl_ditemukan, keterangan, nama_penemu, no_ktp, no_telepon "
                        + "from barang where nama_barang='"+keyword+"' and jenis_barang='"+kategori+"'";
            }
            System.out.println("query = "+query);
            sqlResult = sqlQuery.executeQuery(query);
            
        }catch(SQLException ex){
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        //connect.disconnect();
        return sqlResult;
    }
    
    public boolean cariBarangByID(String id){
        boolean found=false;
        try{
            start();
            //Only God knows what the code below means...
            sqlQuery = connect.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            String query = "select * from barang where id_barang="+id;
            sqlResult = sqlQuery.executeQuery(query);
            sqlResult.last();
            int row = sqlResult.getRow();
            sqlResult.beforeFirst();
            System.out.println("number of rows = "+row);
            if(row==1){
                found=true;
            }
        }catch(SQLException e){
            System.out.println("cari barang failed, error message "+e.toString());
            found = false;
        }
        return found;
    }
    
    public ResultSet lihatSemuaBarang(){
        try {
            sqlQuery = connect.getConnection().createStatement();
            String query = "select * from barang";
            sqlResult = sqlQuery.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     
        return sqlResult;
    }
}
