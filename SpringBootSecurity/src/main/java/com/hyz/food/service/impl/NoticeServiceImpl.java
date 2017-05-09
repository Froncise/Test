package com.hyz.food.service.impl;

import java.util.Date;

import com.hyz.food.service.NoticeService;

public class NoticeServiceImpl implements NoticeService{

	@Override
	public boolean addMessage(String message) {
		Date date = new Date();
		java.sql.Date date1 = new  java.sql.Date(date.getTime());
				
		return false;
	}

}
