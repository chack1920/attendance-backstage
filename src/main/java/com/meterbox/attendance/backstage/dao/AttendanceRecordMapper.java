package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.AttendanceRecord;

public interface AttendanceRecordMapper {
    int deleteByPrimaryKey(String dataId);

    int insert(AttendanceRecord record);

    int insertSelective(AttendanceRecord record);

    AttendanceRecord selectByPrimaryKey(String dataId);

    int updateByPrimaryKeySelective(AttendanceRecord record);

    int updateByPrimaryKey(AttendanceRecord record);
}