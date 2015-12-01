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
    
    
    public void tambahBarang(){
        
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
        
        return sqlResult;
    }
    
    public void lihatSemuaBarang(){
        
    }
}
