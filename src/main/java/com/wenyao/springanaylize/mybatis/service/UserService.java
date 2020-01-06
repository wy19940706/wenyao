package com.wenyao.springanaylize.mybatis.service;

import com.wenyao.springanaylize.mybatis.entity.User;

import java.util.List;

public interface UserService {

    User getUser(Long userId);

    List<User> getUserList();
}
