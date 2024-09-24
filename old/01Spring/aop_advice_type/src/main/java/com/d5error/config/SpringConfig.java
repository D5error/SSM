package com.d5error.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.d5error")
@EnableAspectJAutoProxy
public class SpringConfig {
}
