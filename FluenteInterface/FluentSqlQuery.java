package FluenteInterface;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FluentSqlQuery {
    private Connection connection;
    private StringBuilder queryBuilder;

    public FluentSqlQuery(Connection connection) {
        this.connection = connection;
        this.queryBuilder = new StringBuilder();
    }

    public FluentSqlQuery select(String columns) {
        queryBuilder.append("SELECT ").append(columns);
        return this;
    }

    public FluentSqlQuery from(String table) {
        queryBuilder.append(" FROM ").append(table);
        return this;
    }

    public FluentSqlQuery where(String condition) {
        queryBuilder.append(" WHERE ").append(condition);
        return this;
    }

    public ResultSet execute() throws SQLException {
        String query = queryBuilder.toString();
        System.out.println("Executando consulta: " + query);
        return connection.createStatement().executeQuery(query);
    }
}