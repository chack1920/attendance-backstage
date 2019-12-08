package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.AdminInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(String adminId);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(String adminId);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}