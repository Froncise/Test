package com.hyz.food.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hyz.food.dao.FoodInfoMapper;
import com.hyz.food.entity.FoodInfo;
import com.hyz.food.service.FoodInfoService;

/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @FoodInfoController.java
 */
@Controller
@RequestMapping({ "/food" }) 
public class FoodInfoController {
			
	@Autowired
	private FoodInfoService foodInfoService;
	
	//主页面
	@RequestMapping("/admin")
	public String admin(HttpSession session){
		List<FoodInfo> listType = foodInfoService.findFoodType();
		session.setAttribute("listType", listType);
		return "admin";
	}
	
	//分类添加菜品页面
	@RequestMapping("/getFood")
	public String getFood(Model model,HttpServletRequest request,HttpSession session){
		String foodType = request.getParameter("foodType");
		List<FoodInfo> listFood = foodInfoService.findFoodByType(foodType);
		model.addAttribute("listFood", listFood);
		model.addAttribute("foodType", foodType);
		return "todayFood";
	}
	

	@RequestMapping("/addfood")
	public String addFood(){
		return "addFood";
	}
	
	
	@RequestMapping("/addFoodSubmit")
	public String addFood(FoodInfo foodInfo,Model model) throws Exception{
	  boolean flag = foodInfoService.addFood(foodInfo);
		if(flag){
			model.addAttribute("message", "添加成功！！");
		}else{
			model.addAttribute("message", "添加失败！！已有该菜品");
		}
		return "addFood";
	}
	
	//查询要删除的菜品
	@RequestMapping("/deleteFood")
	public String deleteFood(Model model,HttpServletRequest request,HttpSession session) throws Exception{
		String foodType = request.getParameter("foodType");
		System.out.println(foodType+"   ldld");
		if (foodType!=null) {
			if(foodType.equals("全部")){
				List<FoodInfo> listFood = foodInfoService.findAllFood();
				model.addAttribute("listFood", listFood);
			}else{
				List<FoodInfo> listFood1 = foodInfoService.findFoodByType(foodType);
				model.addAttribute("selectType", foodType);
				model.addAttribute("listFood", listFood1);
			}
		}else {
			List<FoodInfo> listFood = foodInfoService.findAllFood();
			model.addAttribute("listFood", listFood);
		}
		
		
		return "deleteFood";
	}
	
	
	//删除菜品
	@RequestMapping("/deleteFoodsubmit")
	public void deleteFoodsubmit(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		
		//删除菜品
		System.out.println("delfoodsubmit");
		String foodId = request.getParameter("foodId");
		String foodType = request.getParameter("foodType");
		System.out.println(foodType);
		boolean flag = foodInfoService.deleteFood(foodId);
		if(flag){
			model.addAttribute("message", "删除成功");
		}
		else{
			model.addAttribute("message", "删除失败");
		}
		PrintWriter out = response.getWriter();
        /*
         * 在servlet中实现服务器端跳转，并向跳转页面传递参数
         */
        request.setAttribute("foodType", foodType);
        RequestDispatcher dispatcher = request.getRequestDispatcher("deleteFood");    // 使用req对象获取RequestDispatcher对象
        dispatcher.forward(request, response);  // 使用RequestDispatcher对象在服务器端向目的路径跳转

		
		//return "redirect:food/deleteFood"+"?foodType="+foodType;
	}
	
/*	@RequestMapping("/deleteById")
	public String deleteById(Model model,HttpServletRequest request,HttpSession session) throws Exception{
		String foodId = request.getParameter("foodId");
		boolean flag = foodInfoService.deleteFood(foodId);
		String foodType = request.getParameter("foodType");
		if(flag){
			model.addAttribute("message", "删除成功");
		}
		else{
			model.addAttribute("message", "删除失败");
		}
		model.addAttribute("selectType", foodType);
		return "redirect:food/deleteFoodsubmit";
	}*/
	
}
