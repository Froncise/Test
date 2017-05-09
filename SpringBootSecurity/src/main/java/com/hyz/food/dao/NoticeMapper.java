package com.hyz.food.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hyz.food.entity.Notice;
/**
 * 
 * @author ZhangGenhai
 * @date 2017年5月4日
 * @NoticeMapper.java
 */
@Mapper
public interface NoticeMapper {
	//添加消息
	@Insert("INSERT INTO notice(notice_id,notice_content,publish_time,tag) VALUES(#{noticeId}, #{noticeContent}, #{publishTime},#{tag})")
	void insert(Notice notice);
	
	//删除消息
	@Delete("DELETE FROM notice WHERE notice_id =#{noticeId}")
	void delete(@Param("noticeId") String noticeId);
	
}