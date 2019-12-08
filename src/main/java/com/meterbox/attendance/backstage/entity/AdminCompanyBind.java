package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class AdminCompanyBind implements Serializable {
    /**
     * 关系id
     */
    private String relationId;

    /**
     * 管理员id
     */
    private String adminId;

    /**
     * 公司id
     */
    private String companyId;

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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public Long getBindTime() {
        return bindTime;
    }

    public void setBindTime(Long bindTime) {
        this.bindTime = bindTime;
    }
}