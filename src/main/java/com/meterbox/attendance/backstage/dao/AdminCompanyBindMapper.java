package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.AdminCompanyBind;

public interface AdminCompanyBindMapper {
    int deleteByPrimaryKey(String relationId);

    int insert(AdminCompanyBind record);

    int insertSelective(AdminCompanyBind record);

    AdminCompanyBind selectByPrimaryKey(String relationId);

    int updateByPrimaryKeySelective(AdminCompanyBind record);

    int updateByPrimaryKey(AdminCompanyBind record);
}