package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.AdminDeviceBind;

public interface AdminDeviceBindMapper {
    int deleteByPrimaryKey(String relationId);

    int insert(AdminDeviceBind record);

    int insertSelective(AdminDeviceBind record);

    AdminDeviceBind selectByPrimaryKey(String relationId);

    int updateByPrimaryKeySelective(AdminDeviceBind record);

    int updateByPrimaryKey(AdminDeviceBind record);
}