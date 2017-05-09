package com.hyz.food.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hyz.food.entity.FoodInfo;
import com.hyz.food.entity.UserInfo;


/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @FoodInfoService.java
 */
public interface FoodInfoService {
	
	public List<FoodInfo> findFoodByType(String foodType);
	
	public List<FoodInfo> findFoodType();
	
	public List<FoodInfo> findAllFood();
	
	public boolean addFood(FoodInfo foodInfo) ;
	
	public boolean deleteFood(String foodId);
}
