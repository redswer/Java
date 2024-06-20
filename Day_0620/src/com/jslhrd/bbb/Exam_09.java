package com.jslhrd.bbb;

import java.util.Calendar;

public class Exam_09 {
// 달력 Calendar
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //=> 0 ~ 11 이 나오기 때문에 +1
		int date = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK); // => 요일은 1:일요일 ~ 7:토요일
		
		String weekday = "";
		switch (week) {
		case 1:
			weekday = "일";
			break;
		case 2:
			weekday = "월";
			break;
		case 3:
			weekday = "화";
			break;
		case 4:
			weekday = "수";
			break;
		case 5:
			weekday = "목";
			break;
		case 6:
			weekday = "금";
			break;
		case 7:
			weekday = "토";
			break;
		}
		
		weekday = weekday + "요일";
		
		System.out.printf("%d년 %d월 %d일 %s", year, month, date, weekday);
	}

}
