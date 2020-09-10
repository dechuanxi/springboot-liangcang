package com.qf.liangcang.service.impl;

import com.qf.liangcang.mapper.UserMapper;
import com.qf.liangcang.pojo.User;
import com.qf.liangcang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/4
 * @time 16:15
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        System.out.println("UserServiceImpl++addUser++user.getUnickname()====="+user.getUnickname());
        return userMapper.insertUser(user);
    }

    @Override
    public User getUser(int uid) {
        return userMapper.getUser(uid);
    }

    @Override
    public Integer updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public Integer getUidByUphone(String uphone) {
        return userMapper.selectUidByUphone(uphone);
    }
}
