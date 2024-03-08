package FactoryMethod.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnectionFactory implements ConnectionFactory {
  @Override
  public Connection createConnection() throws SQLException {
    return DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb");
  }
}