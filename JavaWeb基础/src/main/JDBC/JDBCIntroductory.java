package main.JDBC;

import java.sql.*;


public class JDBCIntroductory {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc_db?useSSL=false";
        String userName = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, userName, password);

        System.out.println("***** selectAll *****");
        selectAll(conn);
        System.out.println("*********************");

        deleteById(conn, 2);


        System.out.println("***** insert (id=2, name=dog) *****");
        try {
            conn.setAutoCommit(false);
            insert(conn, 2, "dog");
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
        } finally {
            conn.setAutoCommit(true);
        }
        System.out.println("***** insert***********************");

        System.out.println("***** selectAll *****");
        selectAll(conn);
        System.out.println("*********************");

        deleteById(conn, 2);

        conn.close();
    }

    private static void deleteById(Connection conn, int id) throws SQLException {
        Statement statement = conn.createStatement();
        String sql = "delete from vip where id = " + id;
        statement.executeUpdate(sql);
        statement.close();
    }

    private static void insert(Connection conn, int id, String name) throws SQLException {
        Statement statement = conn.createStatement();
        String sql = "insert into vip(id, name) values(" + id + ",' " + name + "');";

        System.out.println("sql: " + sql);
        int count = statement.executeUpdate(sql);

        if (count > 0) {
            System.out.println("插入成功，共" + count + "行");
        } else {
            System.out.println("插入失败");
        }

        statement.close();
    }

    static void selectAll(Connection conn) throws SQLException {
        Statement statement = conn.createStatement();
        String sql = "select * from vip;";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            Vip vip = new Vip(id, name);

            System.out.println(vip);
        }

        resultSet.close();
        statement.close();

    }

    static class Vip {
        private int id;
        private String name;
        public Vip(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Vip{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
