package com.jslhrd.exmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestMapper {
	// 오늘날짜 출력
	@Select("select sysdate from dual")
	public String nowDate();
}