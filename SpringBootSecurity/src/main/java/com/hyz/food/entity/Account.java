package com.hyz.food.entity;

import java.math.BigDecimal;
import java.util.Date;
/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @账目实体类
 */
public class Account {
    private String accountId;

    private BigDecimal fee;

    private Date daytime;

    private Date createTime;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Date getDaytime() {
        return daytime;
    }

    public void setDaytime(Date daytime) {
        this.daytime = daytime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}