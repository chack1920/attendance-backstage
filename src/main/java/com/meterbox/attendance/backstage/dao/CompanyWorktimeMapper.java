package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.CompanyWorktime;

public interface CompanyWorktimeMapper {
    int deleteByPrimaryKey(String workId);

    int insert(CompanyWorktime record);

    int insertSelective(CompanyWorktime record);

    CompanyWorktime selectByPrimaryKey(String workId);

    int updateByPrimaryKeySelective(CompanyWorktime record);

    int updateByPrimaryKey(CompanyWorktime record);
}