package com.meterbox.attendance.backstage.entity;

import java.io.Serializable;

public class CompanyDepartment implements Serializable {
    /**
     * 部门id
     */
    private String dId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门编号
     */
    private String departmentNumber;

    /**
     * 员工数量
     */
    private Integer amount;

    /**
     * 公司id
     */
    private String companyId;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 创建时间
     */
    private Long createdTime;

    private static final long serialVersionUID = 1L;

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId == null ? null : dId.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(String departmentNumber) {
        this.departmentNumber = departmentNumber == null ? null : departmentNumber.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }
}