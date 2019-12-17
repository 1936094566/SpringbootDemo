package com.springbootdemo.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Created with IDEA
 * @author:麻超
 * @Date:2019/12/17
 * @Time:22:49
 **/
@RestController
public class BaseController {

    @Autowired
    private DataSource dataSource;



    @GetMapping("/hello")
    private String hello(){
        return "success!!";
    }

}
