package lostandfound;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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

    public void start() {
        this.connect = new DatabaseConnection(username, password);
    }
    
    public boolean login(String username, String password){
        
        if(this.password.equals(password) && this.username.equals(username)){
            return true;
        }else{
            return false;
        }
    }
    
}
