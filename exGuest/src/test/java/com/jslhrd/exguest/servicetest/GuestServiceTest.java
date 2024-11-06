package com.jslhrd.exguest.servicetest;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jslhrd.exguest.controller.GuestController;
import com.jslhrd.exguest.service.GuestService;

@SpringBootTest
public class GuestServiceTest {
	private static final Logger log = LoggerFactory.getLogger(GuestController.class);
	
	@Autowired
	GuestService service;
	
	@Test
	public void guestCount() {
		log.info("service.guestCount() : " + service.guestCount());
	}
}
