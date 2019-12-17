package com.springbootdemo.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Created with IDEA
 * @author:麻超
 * @Date:2019/12/17
 * @Time:23:00
 **/
@Data
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;
}
