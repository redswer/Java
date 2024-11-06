package com.jslhrd.exguest.mappertest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jslhrd.exguest.controller.GuestController;
import com.jslhrd.exguest.mapper.GuestMapper;

@SpringBootTest
public class GuestMapperTest {
	private static final Logger log = LoggerFactory.getLogger(GuestController.class);
	
	@Autowired
	private GuestMapper mapper;
	
	@Test
	public void guestCount() {
		int cnt = mapper.guestCount();
		log.info("전체 게시글 수 : " + cnt);
	}
}
