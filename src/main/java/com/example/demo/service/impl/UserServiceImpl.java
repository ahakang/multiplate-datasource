package com.example.demo.service.impl;

import com.example.demo.eneity.User;
import com.example.demo.mapper.slave.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:guokk
 * @date: 2019-11-11
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User detail(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
