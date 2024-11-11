package com.jslhrd.exthymeleaf.dto;

import lombok.Data;

@Data
public class ExamDTO {
	private String name;
	private boolean gender;
	private int age;
	
	public ExamDTO() {};
	
	public ExamDTO(String name, boolean gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
}
