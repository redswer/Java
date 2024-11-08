package com.jslhrd.exguest.service;

import java.util.List;

import com.jslhrd.exguest.domain.GuestDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface GuestService {
	public int guestCount();
	public List<GuestDTO> guestList();
	public int guestWrite(GuestDTO dto);
	public GuestDTO guestView(int idx);
	public void guestReadcnt(int idx, HttpServletRequest request, HttpServletResponse response);
	public int guestUpdate(GuestDTO dto);
	public int guestDelete(GuestDTO dto);
}
