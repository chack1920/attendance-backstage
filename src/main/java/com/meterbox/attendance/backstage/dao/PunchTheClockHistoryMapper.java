package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.PunchTheClockHistory;

public interface PunchTheClockHistoryMapper {
    int deleteByPrimaryKey(String dataId);

    int insert(PunchTheClockHistory record);

    int insertSelective(PunchTheClockHistory record);

    PunchTheClockHistory selectByPrimaryKey(String dataId);

    int updateByPrimaryKeySelective(PunchTheClockHistory record);

    int updateByPrimaryKey(PunchTheClockHistory record);
}