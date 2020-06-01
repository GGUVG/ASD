package com.demo.asd.model.staff;

import lombok.Getter;
import lombok.Setter;

public class StaffRequest {
    //员工ID
    public Long staffId;

    //员工名
    public String staffUsername;

    //员工登录密码
    public String staffPassword;

    //员工等级,1普通员工,2主管级,3区域经理级,4集团管理级,5最高级
    public Integer staffLevel;

    //员工所在分行号
    public Long staffBranchId;

    //员工职位
    public String staffJob;

    //签到临时流水号
    public Long todaySerialId;

    //员工头像
    public String staffImg;

    //1启用,0注销
    public Integer status;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public Integer getStaffLevel() {
        return staffLevel;
    }

    public void setStaffLevel(Integer staffLevel) {
        this.staffLevel = staffLevel;
    }

    public Long getStaffBranchId() {
        return staffBranchId;
    }

    public void setStaffBranchId(Long staffBranchId) {
        this.staffBranchId = staffBranchId;
    }

    public String getStaffJob() {
        return staffJob;
    }

    public void setStaffJob(String staffJob) {
        this.staffJob = staffJob;
    }

    public Long getTodaySerialId() {
        return todaySerialId;
    }

    public void setTodaySerialId(Long todaySerialId) {
        this.todaySerialId = todaySerialId;
    }

    public String getStaffImg() {
        return staffImg;
    }

    public void setStaffImg(String staffImg) {
        this.staffImg = staffImg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StaffCriteria{" +
                "staffId=" + staffId +
                ", staffUsername='" + staffUsername + '\'' +
                ", staffPassword='" + staffPassword + '\'' +
                ", staffLevel=" + staffLevel +
                ", staffBranch_id=" + staffBranchId +
                ", staffJob='" + staffJob + '\'' +
                ", todaySerialId=" + todaySerialId +
                ", staffImg='" + staffImg + '\'' +
                ", status=" + status +
                '}';
    }
}
