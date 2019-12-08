package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.CompanyDepartment;

public interface CompanyDepartmentMapper {
    int deleteByPrimaryKey(String dId);

    int insert(CompanyDepartment record);

    int insertSelective(CompanyDepartment record);

    CompanyDepartment selectByPrimaryKey(String dId);

    int updateByPrimaryKeySelective(CompanyDepartment record);

    int updateByPrimaryKey(CompanyDepartment record);
}