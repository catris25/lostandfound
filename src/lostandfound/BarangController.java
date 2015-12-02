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
        System.out.println("masuk fungsi ni..");
        try{
            System.out.println("why");
            //the error is below here
            sqlQuery = connect.getConnection().createStatement();
            String query = "insert into barang values (seq_barang.nextval, '"+ namaBarang+"' , '"+ "jenisBarang"+"' , '" +tglDitemukan +"' , '"+ 
                    ket+"' , '"+ namaPenemu+"' , '"+ noKtp +"' , '"+ noTelepon+"')";
            System.out.println("query : "+query);
            //sqlResult = sqlQuery.executeQuery(query);
            sqlQuery.executeQuery(query);
            //System.out.println("query : "+ query);
            System.out.println("result : "+ sqlResult.toString());
        }catch(SQLException ex){
            message = "Maaf data tidak berhasil diinput dengan benar."+ex.toString();
            System.out.println("message : "+message);
            return message;
        }
        //connect.disconnect();
        message = "Data berhasil diinput!";
        return message;
        
    }
    
    public void ambilBarang(){
        
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
    
    public void lihatSemuaBarang(){
        
    }
}
