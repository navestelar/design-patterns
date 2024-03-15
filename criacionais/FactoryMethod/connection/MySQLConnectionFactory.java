package FactoryMethod.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory implements ConnectionFactory {
  @Override
  public Connection createConnection() throws SQLException {
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb");
  }
}