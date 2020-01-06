package com.wenyao.springanaylize.mybatis.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wenyao.springanaylize.mybatis.dao.UserMapper;
import com.wenyao.springanaylize.mybatis.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(Long userId) {
        return userMapper.getUser(userId);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}

