package com.qf.liangcang.service;

import com.qf.liangcang.pojo.User;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/4
 * @time 16:15
 * @description
 */
public interface UserService {
    Integer addUser(User user);

    User getUser(int uid);

    Integer updateUser(User user);

    Integer getUidByUphone(String uphone);
}
