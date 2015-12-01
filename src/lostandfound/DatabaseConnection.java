package lostandfound;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LIA
 */
public class DatabaseConnection {
    private Connection koneksi;
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    public static String workspace;
    public static String password;
    public static boolean check = true;

    public DatabaseConnection(String ws, String pass) {
        System.out.println("Starting....");
        try {
            Class.forName(driver);
            System.out.println("Driver ditemukan");
            workspace = ws;
            password = pass;
            koneksi = DriverManager.getConnection(url, workspace, pass);
            
            System.out.println("Berhasil terhubung dengan database.");
            check = true;
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver tidak ditemukan");
            check = false;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            check = false;
        }
    }

    public void disconnect() {
        try {
            this.koneksi.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.koneksi;
    }
}
