import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_db";
        String userName = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, userName, password);

        Statement statement = conn.createStatement();
        
        String sql = "select * from vip";
        Object result = statement.executeQuery(sql);
        System.out.println(result);

        statement.close();
        conn.close();
    }
}
