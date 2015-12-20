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

public class UserController {
    private Connection connection;
    private String username = "lostandfound";
    private String password = "007";
    DatabaseConnection connect;
    private Statement sqlQuery;
    private ResultSet sqlResult;
    public static String user;
    

    public void start() {
        this.connect = new DatabaseConnection(username, password);
    }
    
    public boolean login(String username, String password){
        start();
        connect.getConnection();
        boolean found = false;
        username = username.toLowerCase();
        try {
            sqlQuery = connect.getConnection().createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );
            
            
            String query = "select username from admin where password ='"+password+"' and username = '"+username+"'";
            sqlResult = sqlQuery.executeQuery(query);
            sqlResult.last();
            int row = sqlResult.getRow();
            sqlResult.beforeFirst();
            if(row==1){
                this.user = username;
                System.out.println("user : "+this.user);
                found=true;
            }else{
                found = false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            found=false;
        }
        return found;
    }
    
    
}
