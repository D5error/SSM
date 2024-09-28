package main.JDBC;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.Properties;

public class DruidDatabaseConnectionPool {
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));

        String resourcePath = "JavaWeb基础/src/main/JDBC/resource/";

        Properties properties = new Properties();
        properties.load(new FileInputStream(resourcePath + "druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        Statement statement = connection.createStatement();

        String sql = "select * from vip";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("name: " + resultSet.getString("name"));
        }
        connection.close();
    }
}
