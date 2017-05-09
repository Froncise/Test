package com.hyz.food.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyz.food.common.util.GenerateId;
import com.hyz.food.dao.FoodInfoMapper;
import com.hyz.food.entity.FoodInfo;
import com.hyz.food.service.FoodInfoService;

@Service
public class FoodInfoServiceImpl implements FoodInfoService {

	@Autowired
	FoodInfoMapper foodInfoMapper;
	//分类查询菜品
	@Override
	public List<FoodInfo> findFoodByType(String foodType) {
		List<FoodInfo> listFood = foodInfoMapper.selectFoodByType(foodType);
		return listFood;
	}
	//查询菜品种类
	@Override
	public List<FoodInfo> findFoodType() {
		List<FoodInfo> listType = foodInfoMapper.selectFoodType();
		
		return listType;
	}
	
	//添加菜品
	@Override
	public boolean addFood(FoodInfo foodInfo) {
		
		List<FoodInfo> listAllFood = foodInfoMapper.selectAllFood();
		String foodId =GenerateId.generateId();
		foodInfo.setFoodId(foodId);
		
/*		boolean flag = false;
		for(FoodInfo foodInfo1 : listAllFood){
			if (!(foodInfo1.getFoodName().equals(foodInfo.getFoodName()))) {
				foodInfoMapper.insert(foodInfo);
				flag = true;
			}
		}
		
		return flag;*/
		
		if(listAllFood.contains(foodInfo.getFoodName())){			
			return false;
		}else{
			foodInfoMapper.insert(foodInfo);
			return true;
		}
		
	}
	//查询所有菜品
	@Override
	public List<FoodInfo> findAllFood() {
		
		List<FoodInfo> listAllFood = foodInfoMapper.selectAllFood();
		return listAllFood;
	}
	
	//删除菜品
	@Override
	public boolean deleteFood(String foodId) {
		
		List<FoodInfo> listAllFood = foodInfoMapper.selectAllFood();
		boolean flag = false;
		for (FoodInfo foodInfo : listAllFood) {
			if (foodInfo.getFoodId().equals(foodId)) {
				foodInfoMapper.delete(foodId);
				flag = true;
			}
		}
		
		return flag;
		
	}


}
