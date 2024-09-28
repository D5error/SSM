package main.JDBC.JDBCPractice1;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import main.JDBC.JDBCPractice1.pojo.Brand;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class BrandTest {
    // resource/tb_brand.sql
    String resourcePath = "./src/main/JDBC/resource/";

    @Test
    public void testDelete() throws Exception {
        Integer id = 5;


        Properties properties = new Properties();
        properties.load(new FileInputStream(resourcePath + "druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        String sql = "delete from tb_brand where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        int count = statement.executeUpdate();
        System.out.println(count > 0);
        statement.close();
        connection.close();
    }

    @Test
    public void testUpdate() throws Exception {
        Integer id = 4;
        String brandName = "王米";
        String companyName = "王米公司";
        Integer orderd = 666;
        String description = "王大帝";
        Integer status = 0;


        Properties properties = new Properties();
        properties.load(new FileInputStream(resourcePath + "druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        String sql = "update tb_brand set brand_name = ?, " +
                                        "company_name = ?, " +
                                        "orderd = ?, " +
                                        "description = ?,  " +
                                        "status = ? " +
                                        "where id = ?;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, brandName);
        statement.setString(2, companyName);
        statement.setInt(3, orderd);
        statement.setString(4, description);
        statement.setInt(5, status);
        statement.setInt(6, id);

        int count = statement.executeUpdate();
        System.out.println(count > 0);
        statement.close();
        connection.close();
    }

    @Test
    public void testAdd() throws Exception {
        String brandName = "红米";
        String companyName = "红米公司";
        Integer orderd = 200;
        String description = "王腾有大帝之姿";
        Integer status = 1;


        Properties properties = new Properties();
        properties.load(new FileInputStream(resourcePath + "druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        String sql = "insert into tb_brand(brand_name, company_name, orderd, description, status) values(?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, brandName);
        statement.setString(2, companyName);
        statement.setInt(3, orderd);
        statement.setString(4, description);
        statement.setInt(5, status);

        int count = statement.executeUpdate();
        System.out.println(count > 0);
        statement.close();
        connection.close();
    }

    @Test
    public void testSelectAll() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(resourcePath + "druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        String sql = "select * from tb_brand";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        Brand brand = null;
        ArrayList<Brand> brands = new ArrayList<>();
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String brandName = resultSet.getString("brand_name");
            String companyName = resultSet.getString("company_name");
            Integer orderd = resultSet.getInt("orderd");
            String description = resultSet.getString("description");
            Integer status = resultSet.getInt("status");

            brand = new Brand(id, brandName, companyName, orderd, description, status);
            brands.add(brand);
        }
        System.out.println(brands);


        resultSet.close();
        statement.close();
        connection.close();
    }
}
