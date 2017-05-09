package com.hyz.food.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class GenerateId {
	
	//生成Id
	public static String generateId(){
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
	//生成菜单的编号形式
	public static String generateMenuNum(){
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyyMMdd");
		String menuNum = ft.format(date);
		return menuNum;
	}
	
	
}
