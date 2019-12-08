package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class WeekendOrHoliday implements Serializable {
    /**
     * 数据id
     */
    private String dataId;

    /**
     * 部门id
     */
    private String dId;

    /**
     * 员工id
     */
    private String userId;

    /**
     * 签到时间
     */
    private String signInTime;

    /**
     * 签退时间
     */
    private String signBackTime;

    /**
     * 班次
     */
    private String shifts;

    /**
     * 加班时长
     */
    private Float overtimeHours;

    /**
     * 录入时间
     */
    private String createdTime;

    private static final long serialVersionUID = 1L;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSignInTime() {
        return signInTime;
    }

    public void setSignInTime(String signInTime) {
        this.signInTime = signInTime == null ? null : signInTime.trim();
    }

    public String getSignBackTime() {
        return signBackTime;
    }

    public void setSignBackTime(String signBackTime) {
        this.signBackTime = signBackTime == null ? null : signBackTime.trim();
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(String shifts) {
        this.shifts = shifts == null ? null : shifts.trim();
    }

    public Float getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(Float overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }
}