package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description: Spring配置类
 */

@Configuration// 指定该类是Spring的核心配置类（主配置类）

// <context:component-scan base-package="com.spring"></context:component-scan>
@ComponentScan("com.spring")// 开启组件扫描功能，通知Spring扫描指定包下所有Bean类，进行注解解析

// <import resource=""/>
@Import(DataSourceConfiguration.class)

public class SpringConfiguration {

}