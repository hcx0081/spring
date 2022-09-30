package com.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @description: 数据源配置类（抽取出来处理）
 */

// <context:property-placeholder location="classpath:jdbc.properties"></context:property-placeholder>
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {
    
    
    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    
    @Value("${jdbc.url}")
    private String url;
    
    @Value("${jdbc.username}")
    private String username;
    
    @Value("${jdbc.password}")
    private String password;
    
    // <bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource">
    //     <property name="driverClassName" value="${jdbc.driverClassName}"></property>
    //     <property name="url" value="${jdbc.url}"></property>
    //     <property name="username" value="${jdbc.username}"></property>
    //     <property name="password" value="${jdbc.password}"></property>
    // </bean>
    @Bean("dataSource") // 使用在方法上，标注将该方法的返回值作为组件以指定名称存储到Spring容器中。
    public DataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }
}
