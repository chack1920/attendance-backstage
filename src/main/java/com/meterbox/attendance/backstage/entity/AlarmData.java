package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class AlarmData implements Serializable {
    /**
     * 记录id
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
     * 体温
     */
    private Float temperature;

    /**
     * 状态
     */
    private String state;

    /**
     * 打卡时间
     */
    private String time;

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

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}