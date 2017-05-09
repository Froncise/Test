package com.hyz.food.entity;

/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @BookFood.java
 */
public class BookFood {
    private String id;

    private String userId;

    private String menuNum;

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

    public String getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(String menuNum) {
        this.menuNum = menuNum == null ? null : menuNum.trim();
    }
}