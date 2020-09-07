package com.qf.liangcang.mapper;

import com.qf.liangcang.pojo.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/4
 * @time 16:15
 * @description
 */
public interface UserMapper {

//    @Insert("INSERT INTO user(uphone,ucode,ustatus) VALUES(#{uphone},#{ucode},#{ustatus});")
//    Integer insertUser(User user);
    void insertUser(User user);

    User getUser(int uid);

    Integer updateUser(User user);
}
