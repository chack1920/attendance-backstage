package com.meterbox.attendance.backstage.dao;

import com.meterbox.attendance.backstage.entity.HolidayDate;

public interface HolidayDateMapper {
    int deleteByPrimaryKey(String holidayId);

    int insert(HolidayDate record);

    int insertSelective(HolidayDate record);

    HolidayDate selectByPrimaryKey(String holidayId);

    int updateByPrimaryKeySelective(HolidayDate record);

    int updateByPrimaryKey(HolidayDate record);
}