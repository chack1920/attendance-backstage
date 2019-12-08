package com.meterbox.attendance.backstage.service;


import com.meterbox.attendance.backstage.entity.UserInfo;

/**
 * @decription: 用户服务
 * @author: CEM
 * @date: 2019-12-08 10:08
 */
public interface UserService {

    UserInfo selectByPrimaryKey(String userId);

}
