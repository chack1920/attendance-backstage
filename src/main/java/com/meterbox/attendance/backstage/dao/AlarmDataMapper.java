package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.AlarmData;

public interface AlarmDataMapper {
    int deleteByPrimaryKey(String dataId);

    int insert(AlarmData record);

    int insertSelective(AlarmData record);

    AlarmData selectByPrimaryKey(String dataId);

    int updateByPrimaryKeySelective(AlarmData record);

    int updateByPrimaryKey(AlarmData record);
}