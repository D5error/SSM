package com.d5error.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.d5error")
@PropertySource("jdbc.propeties")
public class SpringConfig {
}
