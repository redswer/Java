package com.jslhrd.exjpa.service;

import org.springframework.stereotype.Service;

import com.jslhrd.exjpa.repository.GuestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // 자동 주입 (Autowired)
public class GuestService {
//	@Autowired
	private final GuestRepository guest;
	
	void test() {
		guest.save(null);
	}
}
