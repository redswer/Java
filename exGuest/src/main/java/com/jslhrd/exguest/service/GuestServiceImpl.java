package com.jslhrd.exguest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.exguest.domain.GuestDTO;
import com.jslhrd.exguest.mapper.GuestMapper;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
	
	@Override
	public int guestWrite(GuestDTO dto) {
		int row = mapper.guestWrite(dto);
		
		return row;
	}
	
	@Override
	public GuestDTO guestView(int idx) {
		GuestDTO dto = mapper.guestView(idx);
		
		return dto;
	}
	
	@Override
	public void guestReadcnt(int idx, HttpServletRequest request, HttpServletResponse response) {
		// 쿠키 설정
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();
		
		for (int i = 0; i < cookies.length; i++) {
			info = cookies[i];
			
			if (info.getName().equals("guestCookie" + idx)) {
				bool = true;
				break;
			}
		}
		
		String str = "" + System.currentTimeMillis();
		
		if (!bool) {
			info = new Cookie("guestCookie" + idx, str);
			info.setMaxAge(60 * 5);
			response.addCookie(info);
			mapper.guestReadcnt(idx);
		}
	}
	
	@Override
	public int guestUpdate(GuestDTO dto) {
		int row = mapper.guestUpdate(dto);
		
		return row;
	}
	
	@Override
	public int guestDelete(GuestDTO dto) {
		int row = mapper.guestDelete(dto);
		
		return row;
	}
}
