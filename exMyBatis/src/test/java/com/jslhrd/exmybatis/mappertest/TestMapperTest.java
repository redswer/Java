package com.jslhrd.exmybatis.mappertest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jslhrd.exmybatis.mapper.TestMapper;

@SpringBootTest
public class TestMapperTest {
	private static final Logger log = LoggerFactory.getLogger(TestMapperTest.class);
	
	@Autowired
	TestMapper mapper;
	
	@Test
	public void nowDateTest() throws Exception {
		log.info(mapper.nowDate());
	}
}
