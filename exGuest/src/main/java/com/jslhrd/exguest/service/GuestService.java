package com.jslhrd.exguest.service;

import java.util.List;

import com.jslhrd.exguest.domain.GuestDTO;

public interface GuestService {
	public int guestCount();
	public List<GuestDTO> guestList();
}
