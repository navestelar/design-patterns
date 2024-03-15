package FluenteInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainTest {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.add(5)
        .subtract(2)
        .multiply(3)
        .divide(2);
    System.out.println("Calculator Result: " + calculator.result());

    try {
      Connection connection = DriverManager.getConnection("jdbc:postgresql://172.18.150.143:5432/ecommerce", "postgres",
      "123456");
      FluentSqlQuery queryBuilder = new FluentSqlQuery(connection);
      queryBuilder.select("*")
          .from("produto")
          .where("produto_id > 1");
      System.out.println("Generated SQL Query: " + queryBuilder.execute());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
