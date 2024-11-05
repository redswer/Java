package com.jslhrd.exmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jslhrd.exmybatis.domain.DeptDTO;

@Mapper
public interface TestMapper {
	// 오늘날짜 출력
	@Select("select sysdate from dual")
	public String nowDate();
	
	public String nowDate2();
	
	// emp 테이블 사원 수 출력
	public int empCount();
	
	// dno(부서번호)가 바뀔 경우 (변수 사용)
	public int empCountDno(int dno);
	
	// 등록
	public int deptInsert(DeptDTO dto);
}