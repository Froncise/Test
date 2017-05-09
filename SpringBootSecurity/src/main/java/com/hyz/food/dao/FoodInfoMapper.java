package com.hyz.food.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hyz.food.entity.FoodInfo;

/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @FoodInfoMapper.java
 */
@Mapper
public interface FoodInfoMapper {

	// 根据ID查询菜品
	@Results({ @Result(property = "foodId", column = "food_id"), @Result(property = "foodName", column = "food_name"),
			@Result(property = "foodDetail", column = "food_detail"),
			@Result(property = "foodType", column = "food_type"), @Result(property = "foodPic", column = "food_pic"), })
	@Select("select * from food_info where food_id = #{foodId}")
	FoodInfo selectFoodById(@Param("foodId") String id);

	// 查询所有
	@Results({ @Result(property = "foodId", column = "food_id"), @Result(property = "foodName", column = "food_name"),
			@Result(property = "foodDetail", column = "food_detail"),
			@Result(property = "foodType", column = "food_type"), @Result(property = "foodPic", column = "food_pic"), })
	@Select("select * from food_info order by food_type desc")
	List<FoodInfo> selectAllFood();

	// 分类查询食品
	@Results({ @Result(property = "foodId", column = "food_id"), @Result(property = "foodName", column = "food_name"),
			@Result(property = "foodDetail", column = "food_detail"),
			@Result(property = "foodType", column = "food_type"), @Result(property = "foodPic", column = "food_pic"), })
	@Select("SELECT * FROM food_info WHERE food_type =#{foodType} order by food_name asc")
	List<FoodInfo> selectFoodByType(@Param("foodType") String foodType);

	// 查询菜品类别
	@Results({ @Result(property = "foodType", column = "food_type"), })
	@Select("SELECT distinct(food_type) FROM food_info order  by food_type desc")
	List<FoodInfo> selectFoodType();

	// 更新菜品
	@Update("UPDATE food_info SET food_name=#{foodName},food_detail=#{foodDetail},food_type=#{foodType} WHERE id =#{id}")
	void update(FoodInfo foodInfo);

	// 添加菜品
	@Insert("INSERT INTO food_info(food_id,food_name,food_detail,food_type) VALUES(#{foodId}, #{foodName}, #{foodDetail},#{foodType})")
	void insert(FoodInfo foodInfo);

	// 删除菜品
	@Delete("DELETE FROM food_info WHERE food_id =#{foodId}")
	void delete(@Param("foodId") String foodId);
}