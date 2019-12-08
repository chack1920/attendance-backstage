package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.CompanyInfo;

public interface CompanyInfoMapper {
    int deleteByPrimaryKey(String companyId);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);
}