package com.meterbox.attendance.backstage.service.impl;

import com.meterbox.attendance.backstage.dao.UserInfoMapper;
import com.meterbox.attendance.backstage.entity.UserInfo;
import com.meterbox.attendance.backstage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 用户服务实现类
 * @Author: CEM
 * @Date: 2019/12/8 11:10
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo selectByPrimaryKey(String userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }
}
