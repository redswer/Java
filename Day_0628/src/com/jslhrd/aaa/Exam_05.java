package com.jslhrd.aaa;

import java.util.*;

public class Exam_05 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("java", "1234"); // 아이디, 비밀번호
		map.put("spring", "1234");
		map.put("servlet", "1234");
		map.put("oracle", "1234");
		map.put("web", "1234");
		
		// keySet => key 값만 추출하여 Set 반환
		// entrySet => Map.Entry 객체(key, 값)를 Set 에 담아 반환
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		Iterator<Map.Entry<String, String>> iter = set.iterator();
		while (iter.hasNext()) {
			Map.Entry<String, String> m = iter.next();
			System.out.print("아이디 : " + m.getKey() + "\n");
			System.out.println("비밀번호 : " + m.getValue());
			System.out.println();
		}
	}

}
