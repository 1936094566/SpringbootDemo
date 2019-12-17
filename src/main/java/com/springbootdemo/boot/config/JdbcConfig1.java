package com.springbootdemo.boot.config;

/**
 * @Created with IDEA
 * @author:麻超
 * @Date:2019/12/17
 * @Time:22:59
 **/

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 第二种注入方式 放在 application.properties   与jdbcProperties配套
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig1 {
    @Bean
    public DataSource getDataSource(JdbcProperties jdbcProperties){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(jdbcProperties.getUrl());
        druidDataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        druidDataSource.setUsername(jdbcProperties.getUsername());
        druidDataSource.setPassword(jdbcProperties.getPassword());
        return  druidDataSource;
    }
}
