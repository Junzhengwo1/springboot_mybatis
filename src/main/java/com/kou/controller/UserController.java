package com.kou.controller;

import com.kou.domain.User;
import com.kou.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author JIAJUN KOU
 */
@Controller
public class UserController {
    @Autowired
    private IUserDao userDao;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<User> findAll(){
        List<User> users = userDao.findAll();
        return users;
    }
}
