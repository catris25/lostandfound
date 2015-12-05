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
    
    
    public String tambahBarang(String namaBarang, String jenisBarang, String tglDitemukan, String ket, String namaPenemu, String noKtp, String noTelepon){
        String message;
        
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query = "insert into barang values (seq_barang.nextval, '"+ namaBarang+"', '"+jenisBarang+"' , to_date('" +tglDitemukan +"', 'MM/DD/YYYY') , '"+ 
                    ket+"' , '"+ namaPenemu+"' , '"+ noKtp +"' , '"+ noTelepon+"',"+0+")";
            
            sqlQuery.executeQuery(query);
        }catch(SQLException ex){
            message = "Maaf data gagal diinput!";
            System.out.println("message : "+message);
            return message;
        }
        
        connect.disconnect();
        message = "Data berhasil diinput!";
        return message;
        
    }
    
    public String ambilBarang(String nama, String noKtp, String tglMengambil, String noTelepon, String alamat, String idBarang){
        String message;
        
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query = "insert into values(seq_pemilik.nextval, '"+nama+"', '"+noKtp+"', to_date('"+tglMengambil+"', 'MM/DD/YYYY'),'"
                    +noTelepon+"','"+alamat+"',"+idBarang+")";
            System.out.println("query 1 : "+query);
            sqlQuery.executeQuery(query);
            query = "update Barang set status_pengambilan="+1+" where id_barang="+idBarang;
            System.out.println("query 2 : "+query);
            
            sqlQuery.executeQuery(query);
        }catch(SQLException e){
            message = "Maaf data gagal diinput!";
            System.out.println("message : "+message);
            return message;
        }
        
        connect.disconnect();
        message = "Data berhasil diinput!";
        return message;
    }
    
    public ResultSet lihatBarangHilang(){
        
        try {
            sqlQuery = connect.getConnection().createStatement();
            String query = "select * from barang";
            sqlResult = sqlQuery.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(BarangController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        //connect.disconnect();
        return sqlResult;
    }
    
    public ResultSet cariBarangHilang(String keyword, String kategori){
        try{
            start();
            sqlQuery = connect.getConnection().createStatement();
            String query;
            if(keyword.isEmpty()){
                query = "select * from barang where jenis_barang='"+kategori+"'";
            }else{
                query = "select * from barang where nama_barang='"+keyword+"' and jenis_barang='"+kategori+"'";
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
            sqlQuery = connect.getConnection().createStatement();
            String query = "select * from barang where id_barang='"+id+"'";
            sqlResult = sqlQuery.executeQuery(query);
            found = true;
        }catch(SQLException e){
            System.out.println("cari barang failed, error message "+e.toString());
            found = false;
        }
        return found;
    }
    
    public void lihatSemuaBarang(){
        
    }
}
