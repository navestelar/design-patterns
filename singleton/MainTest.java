import java.sql.Connection;

public class MainTest {
  public static void main(String[] args) {
    ConfiguracaoApp config = ConfiguracaoApp.getInstance();
    System.out.println("Database URL: " + config.getPropriedade("database.url"));
    System.out.println("Database User: " + config.getPropriedade("database.user"));
    System.out.println("Database Password: " + config.getPropriedade("database.password"));

    Connection connection = DatabaseConnection.getConnection();
    if (connection != null) {
      System.out.println("Successfully connected to the database.");
    } else {
      System.out.println("Failed to connect to the database.");
    }
  }
}
