import java.sql.*;


public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_db";
        String userName = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, userName, password);

        Statement statement = conn.createStatement();
        
        String sql = "select * from vip";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("id=" + id + ", name=" + name);
        }

        statement.close();
        conn.close();
    }
}
