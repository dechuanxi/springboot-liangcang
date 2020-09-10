package com.qf.liangcang.controller;

import com.qf.liangcang.bean.AjaxMessage;
import com.qf.liangcang.pojo.User;
import com.qf.liangcang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
     * <p>
     * <p>
     * 0909：判断手机号是否存在select uid from user where uphone = #{uphone}
     * 不存在直接插入
     * 存在 update user set ucode = #{code}
     *
     * @param user
     * @return
     */
    @PostMapping("/add")
    public Integer add(User user, HttpServletRequest request) {

        try {
            Integer uidByUphone = userService.getUidByUphone(user.getUphone());
            if (uidByUphone != null) {
                user.setUid(uidByUphone);
                userService.updateUser(user);
            } else {
                user.setUnickname(user.getUphone().substring(7, 11));
                user.setUstatus("1");
                Integer uid = userService.addUser(user);
                user.setUid(uid);
                request.getSession().setAttribute("loginUser", user);
                return uid;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/get")
    public User getUser(int uid) {
        return userService.getUser(uid);
    }

    /**
     * 根据id更新
     *
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
