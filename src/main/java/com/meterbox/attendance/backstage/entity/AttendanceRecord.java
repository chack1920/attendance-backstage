package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class AttendanceRecord implements Serializable {
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
     * 签到状态
     */
    private String signInState;

    /**
     * 签退时间
     */
    private String signBackTime;

    /**
     * 签退状态
     */
    private String signBackState;

    /**
     * 班次
     */
    private String shifts;

    /**
     * 考勤状态
     */
    private String attendanceState;

    /**
     * 异常处理
     */
    private String exceptionHandle;

    /**
     * 录入时间
     */
    private Long createdTime;

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

    public String getSignInState() {
        return signInState;
    }

    public void setSignInState(String signInState) {
        this.signInState = signInState == null ? null : signInState.trim();
    }

    public String getSignBackTime() {
        return signBackTime;
    }

    public void setSignBackTime(String signBackTime) {
        this.signBackTime = signBackTime == null ? null : signBackTime.trim();
    }

    public String getSignBackState() {
        return signBackState;
    }

    public void setSignBackState(String signBackState) {
        this.signBackState = signBackState == null ? null : signBackState.trim();
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(String shifts) {
        this.shifts = shifts == null ? null : shifts.trim();
    }

    public String getAttendanceState() {
        return attendanceState;
    }

    public void setAttendanceState(String attendanceState) {
        this.attendanceState = attendanceState == null ? null : attendanceState.trim();
    }

    public String getExceptionHandle() {
        return exceptionHandle;
    }

    public void setExceptionHandle(String exceptionHandle) {
        this.exceptionHandle = exceptionHandle == null ? null : exceptionHandle.trim();
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}