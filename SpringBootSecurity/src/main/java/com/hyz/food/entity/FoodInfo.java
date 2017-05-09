package com.hyz.food.entity;

/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @菜品信息实体类
 */
public class FoodInfo {
    private String foodId;

    private String foodName;

    private String foodDetail;

    private String foodType;

    private byte[] foodPic;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId == null ? null : foodId.trim();
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(String foodDetail) {
        this.foodDetail = foodDetail == null ? null : foodDetail.trim();
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType == null ? null : foodType.trim();
    }

    public byte[] getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(byte[] foodPic) {
        this.foodPic = foodPic;
    }
    
    @Override
    public boolean equals(Object key){
//    	System.out.println("eq"+key.toString());
    	if(this.foodName.equals(((FoodInfo)key).getFoodName())){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    @Override
    public int hashCode(){
    	return foodId.hashCode();
    }
}