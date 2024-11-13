package com.jslhrd.exjpa.dto;

import com.jslhrd.exjpa.entity.GuestEntity;

import lombok.Getter;

@Getter
public class GuestResponseDTO {
	private int idx;
	private String name;
	private String subject;
	private String contents;
	private String regdate;
	private int readcnt;
	
	public GuestResponseDTO(GuestEntity entity) {
		this.idx = entity.getIdx();
		this.name = entity.getName();
		this.subject = entity.getSubject();
		this.contents = entity.getContents();
		this.regdate = entity.getRegdate();
		this.readcnt = entity.getReadcnt();
	}
}
