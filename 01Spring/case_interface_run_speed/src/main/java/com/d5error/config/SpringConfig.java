package com.d5error.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.d5error")
@Import({JdbcConfig.class, MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {
}
