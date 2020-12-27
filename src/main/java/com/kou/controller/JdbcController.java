package com.kou.controller;


import com.kou.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author JIAJUN KOU
 */
@RestController
public class JdbcController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DataSource dataSource;

    @GetMapping("/userList")
    @ResponseBody
    public List<User> findAll(){
        String sql="select * from user";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    //而且框架还自动声明了事务
    @GetMapping("/addUser")
    public String addUser(){
        String sql="insert into user (username,password) value(?,?)";
        jdbcTemplate.update(sql,"王后","123456");
        return "ok";
    }
}
