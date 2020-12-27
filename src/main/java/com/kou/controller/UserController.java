package com.kou.controller;

import com.kou.dao.UserDao;
import com.kou.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JIAJUN KOU
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/findAll")
    public List<User> findAll(){
        List<User> users = userDao.findAll();
        return users;
    }

    @RequestMapping("/addUser")
    public String addUser(){
        User user=new User();
        user.setUsername("陛下");
        user.setPassword("963258");
        userDao.addUser(user);
        return "ok";
    }
    @GetMapping("/findOne")
    public User findOne(){
        User user = userDao.findUserById(2);
        return user;
    }
}
