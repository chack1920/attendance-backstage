package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.CompanyWorktimeDefault;

public interface CompanyWorktimeDefaultMapper {
    int deleteByPrimaryKey(String workId);

    int insert(CompanyWorktimeDefault record);

    int insertSelective(CompanyWorktimeDefault record);

    CompanyWorktimeDefault selectByPrimaryKey(String workId);

    int updateByPrimaryKeySelective(CompanyWorktimeDefault record);

    int updateByPrimaryKey(CompanyWorktimeDefault record);
}