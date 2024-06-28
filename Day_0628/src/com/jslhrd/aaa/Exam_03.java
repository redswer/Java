package com.jslhrd.aaa;

import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("F", 90);
		map.put("S", 75);
		map.put("A", 95);
		map.put("R", 90);
		map.put("D", 85);
		map.put("K", 95);
		map.put("C", 80);
		map.put("B", 88);
		
		System.out.println(map);
		
		/* 점수의 합계, 평균 */
		Collection<Integer> values = map.values();
		
		System.out.println(values);
		System.out.println(map.size());
		
		int tot = 0;
		for(Integer value : map.values()) {
			tot += value;
		}
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + (double)tot / map.size());
		
		System.out.println("--------------------------------");
		
		/* 이름	점수
		 * A	90
		 * ...
		 * 총점 : xx
		 * 평균 : xx
		 */
		tot = 0;
		Set<String> set = map.keySet();
		
		System.out.println("이름\t점수");
		for (String key : set) {
			tot += map.get(key);
			System.out.printf("%s\t%d\n", key, map.get(key));
		}
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + (double)tot / map.size());
	}

}
