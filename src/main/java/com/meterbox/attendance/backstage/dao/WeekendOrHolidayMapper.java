package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.WeekendOrHoliday;

public interface WeekendOrHolidayMapper {
    int deleteByPrimaryKey(String dataId);

    int insert(WeekendOrHoliday record);

    int insertSelective(WeekendOrHoliday record);

    WeekendOrHoliday selectByPrimaryKey(String dataId);

    int updateByPrimaryKeySelective(WeekendOrHoliday record);

    int updateByPrimaryKey(WeekendOrHoliday record);
}