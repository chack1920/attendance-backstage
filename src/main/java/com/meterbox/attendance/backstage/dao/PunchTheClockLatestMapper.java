package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.PunchTheClockLatest;

public interface PunchTheClockLatestMapper {
    int deleteByPrimaryKey(String dataId);

    int insert(PunchTheClockLatest record);

    int insertSelective(PunchTheClockLatest record);

    PunchTheClockLatest selectByPrimaryKey(String dataId);

    int updateByPrimaryKeySelective(PunchTheClockLatest record);

    int updateByPrimaryKey(PunchTheClockLatest record);
}