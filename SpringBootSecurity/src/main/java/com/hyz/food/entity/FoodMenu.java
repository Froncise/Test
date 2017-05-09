package com.hyz.food.entity;

import java.util.Date;

/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @今日菜单实体类
 */
public class FoodMenu {
    private String id;

    private String menuNum;

    private String foodId;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMenuNum() {
        return menuNum;
    }

    public void setMenuNum(String menuNum) {
        this.menuNum = menuNum == null ? null : menuNum.trim();
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId == null ? null : foodId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}