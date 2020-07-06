package isud;

import db.DatabaseConnectionManager;
import java.sql.*;


public class divided {
    public static void main(String[] args) throws SQLException {
       CheckInsert();
       CheckSelect();
       CheckUpdate();
       CheckDelete();


    }

    public static void CheckInsert () throws SQLException {
        Connection conn = DatabaseConnectionManager.getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO categories(id,name) VALUES (48,'Testing');");

    }
    private static void CheckSelect() throws SQLException {
        Connection conn = DatabaseConnectionManager.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * From categories;");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3));
        }
     }
    private static void CheckUpdate () throws SQLException {
         Connection conn = DatabaseConnectionManager.getConnection();
         Statement st = conn.createStatement();
         st.executeUpdate("UPDATE categories SET id=49 WHERE name = 'Testing';");
            }
    private static void CheckDelete () throws SQLException {
         Connection conn = DatabaseConnectionManager.getConnection();
         Statement st = conn.createStatement();
         st.executeUpdate("DELETE FROM categories WHERE id = 49 AND name = 'Testing' ");

    }
}

