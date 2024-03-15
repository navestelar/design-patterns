import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection con = null;
    private static final String url = "jdbc:postgresql://172.18.150.143:5432/ecommerce";
    private static final String user = "postgres";
    private static final String pass = "123456";

    private DatabaseConnection() {}

    public static synchronized Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return con;
    }
}