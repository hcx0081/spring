package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * {@code @Description:} Spring配置类
 */

@Configuration// 定义Spring配置类

// <context:component-scan base-package="com.spring"></context:component-scan>
@ComponentScan("com.spring")

// <import resource=""/>
@Import(DataSourceConfiguration.class)

public class SpringConfiguration {

}