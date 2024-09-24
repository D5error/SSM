package com.d5error.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.d5error.dao.impl")
@Import(JdbcConfig.class)
@PropertySource("jdbc.propeties")
public class SpringConfig {

}
