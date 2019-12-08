package com.meterbox.attendance.backstage.controller;

import com.meterbox.attendance.backstage.common.Result;
import com.meterbox.attendance.backstage.entity.UserInfo;
import com.meterbox.attendance.backstage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 用户Controller
 * @Author: CEM
 * @Date: 2019/12/8 10:10
 */
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户Id获取用户信息
     * @param userId
     * @return
     */
    @RequestMapping("/get_userinfo")
    public Result selectUserInfoById(@RequestParam("userId") String userId) {
        UserInfo userInfo = userService.selectByPrimaryKey(userId);
        return new Result(userInfo);
    }
}
