package com.jslhrd.exmybatis.mappertest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jslhrd.exmybatis.domain.DeptDTO;
import com.jslhrd.exmybatis.mapper.TestMapper;

@SpringBootTest
public class TestMapperTest {
	private static final Logger log = LoggerFactory.getLogger(TestMapperTest.class);
	
	@Autowired
	TestMapper mapper;
	
	@Test
	public void nowDateTest() throws Exception {
		log.info("nowDate : " + mapper.nowDate());
	}
	
	@Test
	public void nowDateTest2() throws Exception {
		log.info("nowDate2 : " + mapper.nowDate2());
	}
	
	@Test
	public void empCount() throws Exception {
		log.info("count : " + mapper.empCount());
	}
	
	@Test
	public void empCountDno() throws Exception {
		log.info("dnoCount : " + mapper.empCountDno(10));
	}
	
	@Test
	public void deptInsert() throws Exception {
		DeptDTO dto = new DeptDTO();
		dto.setDno(100);
		dto.setDname("JSL");
		dto.setLoc("대전");
		
		log.info("emptInsert : " + mapper.deptInsert(dto));
	}
}
