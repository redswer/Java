package com.jslhrd.exjpa.dto;

import com.jslhrd.exjpa.entity.GuestEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 기본 생성자 자동 추가
@Getter
public class GuestRequestDTO {
	private String name;
	private String subject;
	private String contents;
	
	@Builder
	public GuestRequestDTO(String name, String subject, String contents) {
		this.name = name;
		this.subject = subject;
		this.contents = contents;
	}
	
	public GuestEntity toEntity() {
		return GuestEntity.builder().name(name).subject(subject).contents(contents).build();
	}
}
