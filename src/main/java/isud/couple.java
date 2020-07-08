package isud;

        import java.sql.SQLException;
        import db.DatabaseConnectionManager;
        import java.sql.*;

public class couple {

    public static void main(String[] args) throws SQLException {

        CheckCode();

    }

    public static void CheckCode() throws SQLException {
        Connection conn = DatabaseConnectionManager.getConnection();
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO categories(id,name) VALUES (48,'Testing');");

        ResultSet rs = st.executeQuery("SELECT * From categories;");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" +rs.getString(3));
        }
        st.executeUpdate("UPDATE categories SET id=49 WHERE name = 'Testing';");
        st.executeUpdate(
                "DELETE FROM categories WHERE id = 49 AND name = 'Testing' ");
        System.out.println("____________________________________");
        ResultSet ss = st.executeQuery("SELECT * From categories;");
        while (ss.next()) {
            System.out.println(ss.getInt(1) + ":" + ss.getString(2) + ":" +ss.getString(3));
        }
    }
}