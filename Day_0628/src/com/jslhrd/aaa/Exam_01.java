package com.jslhrd.aaa;

import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
//		Map map = new HashMap<>();
//		
//		map.put("aaa", 90);
//		map.put(1, 90);
//		map.put(3.14, "aaa");
//		map.put('A', 90);
		// => key 와 value 모두 Object (바람직하지 않음)
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("D", 90);
		map.put("A", 90);
		map.put("B", 80);
		map.put("C", 70);
		map.put("A", 60);
		System.out.println(map);
		// => key 값은 중복 x (A = 60)
		
		System.out.println("객체 수 : " + map.size());
		System.out.println("키 A 의 값: " + map.get("A"));
		System.out.println("키 B 포함 여부 : " + map.containsKey("B"));
		System.out.println("값 90 포함 여부 : " + map.containsValue(60));
	}

}
