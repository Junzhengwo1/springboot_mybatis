package com.kou.dao;

import com.kou.domain.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author JIAJUN KOU
 */
@Mapper
public interface IUserDao {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();
}
