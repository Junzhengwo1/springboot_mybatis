package com.kou.dao;

import com.kou.domain.User;
import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JIAJUN KOU
 */
@Mapper
@Repository
public interface UserDao {



    List<User> findAll();

    //使用注解查询时，yml配置中需要把mapper-locations: classpath:mybatis/mapper/*.xml
    //取消

    @Select("select * from user where id=#{id}")
    User findUserById(Integer id);

    public void addUser(User user);


}
