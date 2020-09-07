package com.qf.liangcang.controller;

import com.qf.liangcang.bean.AjaxMessage;
import com.qf.liangcang.pojo.User;
import com.qf.liangcang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WDZ
 * @date 2020/9/4
 * @time 16:14
 * @description
 */
@RestController
@RequestMapping("/lc/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 添加用户之前要校验手机号是否已经存在，存在校验登录状态，不存在直接插入
     * 根据手机号查询登录状态，ustatus为0表示登录成功，为1表示登录失败
     * @param user
     * @return
     */
    @PostMapping("/add")
    public AjaxMessage add(User user) {

        String substring = user.getUphone().substring(7, 11);
        System.out.println("user.getUphone().substring(7, 10)"+substring);
        try {
//            user.setUnickname("aanncc");
            user.setUnickname(user.getUphone().substring(7, 10));
            user.setUstatus("1");
            userService.addUser(user);
            return new AjaxMessage(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxMessage(false, "添加失败");
    }

    @GetMapping("/get")
    public User getUser(int uid) {
        return userService.getUser(uid);
    }

    /**
     * 根据id更新，写错了
     * @param user
     * @return
     */
    @PutMapping("/update")
    public AjaxMessage updateUser(User user) {
        try {
            userService.updateUser(user);
            return new AjaxMessage(true, "更新成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new AjaxMessage(false, "更新失败");
    }
}