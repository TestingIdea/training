package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DatabaseConnectionManager {
    public static void main(String[] args) throws SQLException {
        getConnection();
    }
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://10.10.0.242/material-management";
        Properties props = new Properties();
        props.setProperty("user","vdmihailov");
        props.setProperty("password","c4tnbmg9w");
        props.setProperty("ssl","false");
        return DriverManager.getConnection(url, props);


    }
}
