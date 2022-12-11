package singleton;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connection {

    private final java.sql.Connection jdbcConnection;
    private static Connection connection;

    private Connection(java.sql.Connection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @SneakyThrows
    private Connection() {
        jdbcConnection = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
    }

    @SneakyThrows
    public void executeQuery(String query) {
        Statement stmt = jdbcConnection.createStatement();
        stmt.executeUpdate(query);

    }

    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }
}
