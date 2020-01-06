package com.wenyao.springanaylize.mybatis.customermybatis;

import com.wenyao.springanaylize.mybatis.customermybatis.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void getUserList() {
        userMapper.getUserList();
    }

}
