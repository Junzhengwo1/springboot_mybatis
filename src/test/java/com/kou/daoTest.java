package com.kou;

import com.kou.dao.IUserDao;
import com.kou.domain.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author JIAJUN KOU
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class daoTest {
    @Autowired
    private IUserDao userDao;
    @Test
    public void findAll(){

        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
