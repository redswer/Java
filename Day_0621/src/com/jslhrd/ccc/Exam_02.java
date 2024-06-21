package com.jslhrd.ccc;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exam_02 {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}

}
