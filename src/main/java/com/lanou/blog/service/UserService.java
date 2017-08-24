package com.lanou.blog.service;


import com.lanou.blog.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by dllo on 2017/8/23.
 */
public interface UserService {

    User findAllUser(String name, String password);
    void insertUser(User user);
    User findByName(@Param("name") String name);
}
