package main.JDBC;

import java.sql.*;

public class SQLInjection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_db?useSSL=false";
        String username = "root";
        String password = "123456";
        Connection conn = getMySQLConnection(url, username, password);

        System.out.println("正常登录，并成功");
        login(conn, 1234, "123456");

        System.out.println("********************");
        System.out.println("正常登录，并失败");
        login(conn, 1234, "123456s");


        System.out.println("********************");
        System.out.println("sql注入，并成功");
        login(conn, 1234, "'or '1' = '1");

        System.out.println("********************");
        System.out.println("sql注入，并失败");
        loginBySafety(conn, 1234, "'or '1' = '1");

        conn.close();

    }

    private static void loginBySafety(Connection conn, int account, String password) throws SQLException {
        String sql = "select * from login where account = ? and password = ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1, account);
        preparedStatement.setString(2, password);

        System.out.println("sql = " + sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        resultSet.close();

        preparedStatement.close();
    }

    private static void login(Connection conn, int account, String password) throws SQLException {
        Statement statement = conn.createStatement();
        String sql = "select * from login where account = " + account + " and password = '" + password + "';";


        System.out.println("account = " + account);
        System.out.println("password = " + password);
        System.out.println("sql = " + sql);
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        resultSet.close();
        statement.close();
    }

    private static Connection getMySQLConnection(String url, String username, String password) throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
}
