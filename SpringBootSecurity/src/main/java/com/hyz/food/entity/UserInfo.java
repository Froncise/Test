package com.hyz.food.entity;

import java.util.Date;

/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @用户信息实体类
 */
public class UserInfo {
    private String userId;

    private String userName;

    private String userPwd;

    private String userPhone;

    private String userRole;

    private Date lunchLimit;

    private Date dinnerLimit;

    private Long money;

    private String remarks;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public Date getLunchLimit() {
        return lunchLimit;
    }

    public void setLunchLimit(Date lunchLimit) {
        this.lunchLimit = lunchLimit;
    }

    public Date getDinnerLimit() {
        return dinnerLimit;
    }

    public void setDinnerLimit(Date dinnerLimit) {
        this.dinnerLimit = dinnerLimit;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}