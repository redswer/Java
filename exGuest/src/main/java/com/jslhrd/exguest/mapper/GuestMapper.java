package com.jslhrd.exguest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jslhrd.exguest.domain.GuestDTO;

@Mapper
public interface GuestMapper {
	// 전체 글 수 카운트
	public int guestCount();
	
	// 전체 목록
	public List<GuestDTO> guestList();
	
	// 등록
	public int guestWrite(GuestDTO dto);
	
	// 상세
	public GuestDTO guestView(int idx);
	
	// 조회수
	public int guestReadcnt(int idx);
	
	// 수정
	public int guestUpdate(GuestDTO dto);
	
	// 삭제
	public int guestDelete(GuestDTO dto);
}
