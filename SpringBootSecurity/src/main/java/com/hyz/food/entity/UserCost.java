package com.hyz.food.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @UserCost.java
 */
public class UserCost {
    private String id;

    private String userId;

    private Date month;

    private BigDecimal userCost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public BigDecimal getUserCost() {
        return userCost;
    }

    public void setUserCost(BigDecimal userCost) {
        this.userCost = userCost;
    }
}