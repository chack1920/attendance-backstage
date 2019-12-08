package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class HolidayDate implements Serializable {
    /**
     * 节假日id
     */
    private String holidayId;

    /**
     * 日期
     */
    private String holidayDate;

    private static final long serialVersionUID = 1L;

    public String getHolidayId() {
        return holidayId;
    }

    public void setHolidayId(String holidayId) {
        this.holidayId = holidayId == null ? null : holidayId.trim();
    }

    public String getHolidayDate() {
        return holidayDate;
    }

    public void setHolidayDate(String holidayDate) {
        this.holidayDate = holidayDate == null ? null : holidayDate.trim();
    }
}