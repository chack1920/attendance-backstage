package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class AdminDeviceBind implements Serializable {
    /**
     * 关系id
     */
    private String relationId;

    /**
     * 管理员id
     */
    private String adminId;

    /**
     * 考勤机的设备Id号
     */
    private String deviceId;

    /**
     * 绑定时间
     */
    private Long bindTime;

    private static final long serialVersionUID = 1L;

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId == null ? null : relationId.trim();
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Long getBindTime() {
        return bindTime;
    }

    public void setBindTime(Long bindTime) {
        this.bindTime = bindTime;
    }
}