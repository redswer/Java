package com.jslhrd.exguest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.exguest.domain.GuestDTO;
import com.jslhrd.exguest.mapper.GuestMapper;

@Service
public class GuestServiceImpl implements GuestService {
	@Autowired
	private GuestMapper mapper;
	
	@Override
	public int guestCount() {
		int cnt = mapper.guestCount();
		
		return cnt;
	}
	
	@Override
	public List<GuestDTO> guestList() {
		List<GuestDTO> list = mapper.guestList();
		
		return list;
	}
}
