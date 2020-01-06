package com.wenyao.springanaylize.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wenyao.springanaylize.mybatis.entity.User;

public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{userId}")
    User getUser(@Param("userId") Long userId);

    @Select("SELECT * FROM user")
    List<User> getUserList();
}
