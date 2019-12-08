package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class CompanyWorktimeDefault implements Serializable {
    /**
     * 工作id
     */
    private String workId;

    /**
     * 上班时间
     */
    private String goToWorkTime;

    /**
     * 下班时间
     */
    private String goOffWorkTime;

    /**
     * 星期
     */
    private String week;

    /**
     * 开始签到时间
     */
    private String startSigninTime;

    /**
     * 结束签到时间
     */
    private String endSigninTime;

    /**
     * 开始签退时间
     */
    private String startSignbackTime;

    /**
     * 结束签退时间
     */
    private String endSignbackTime;

    /**
     * 迟到多久算正常
     */
    private Integer late;

    /**
     * 早退多久算正常
     */
    private Integer leaveEarly;

    /**
     * 打卡最小间隔
     */
    private Integer intervalTime;

    /**
     * 录入时间
     */
    private Long createdTime;

    private static final long serialVersionUID = 1L;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getGoToWorkTime() {
        return goToWorkTime;
    }

    public void setGoToWorkTime(String goToWorkTime) {
        this.goToWorkTime = goToWorkTime == null ? null : goToWorkTime.trim();
    }

    public String getGoOffWorkTime() {
        return goOffWorkTime;
    }

    public void setGoOffWorkTime(String goOffWorkTime) {
        this.goOffWorkTime = goOffWorkTime == null ? null : goOffWorkTime.trim();
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week == null ? null : week.trim();
    }

    public String getStartSigninTime() {
        return startSigninTime;
    }

    public void setStartSigninTime(String startSigninTime) {
        this.startSigninTime = startSigninTime == null ? null : startSigninTime.trim();
    }

    public String getEndSigninTime() {
        return endSigninTime;
    }

    public void setEndSigninTime(String endSigninTime) {
        this.endSigninTime = endSigninTime == null ? null : endSigninTime.trim();
    }

    public String getStartSignbackTime() {
        return startSignbackTime;
    }

    public void setStartSignbackTime(String startSignbackTime) {
        this.startSignbackTime = startSignbackTime == null ? null : startSignbackTime.trim();
    }

    public String getEndSignbackTime() {
        return endSignbackTime;
    }

    public void setEndSignbackTime(String endSignbackTime) {
        this.endSignbackTime = endSignbackTime == null ? null : endSignbackTime.trim();
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getLeaveEarly() {
        return leaveEarly;
    }

    public void setLeaveEarly(Integer leaveEarly) {
        this.leaveEarly = leaveEarly;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}