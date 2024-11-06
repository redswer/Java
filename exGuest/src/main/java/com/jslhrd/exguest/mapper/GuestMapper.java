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
	public int guestInsert(GuestDTO dto);
	
	// 수정
	public int guestUpdate();
	
	// 검색
	public GuestDTO guestDetail();
	
	// 삭제
	public int guestDelete();
}
