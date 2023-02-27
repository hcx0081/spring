package com.spring.ano;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @Description:}
 */
@ComponentScan("com")
// @PropertySource("classpath:jdbc.properties")
@Configuration
public class Config {
    // @Value("${jdbc.name}")
    String name;
}