package com.jslhrd.aaa;

import java.util.*;

public class Exam_02 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "기학생");
		map.put(12, "오학생");
		map.put(3, "강학생");
		map.put(24, "박학생");
		map.put(5, "박학생");
		map.put(6, "홍학생");
		map.put(17, "기학생");
		map.put(8, "최학생");
		// => key 값이 한자리 수만 있을때는 자동 정렬되지만, 두 자리 이상이 있으면 정렬 x
		
		System.out.println(map);
		
		int cnt = map.size();
		Set<Integer> keySet = map.keySet();
		// => keySet() : key 만 뽑아서 set 에 저장
		
		// 확장 for문
		for (Integer key : keySet) {
			System.out.print(key + " : ");
			System.out.print(map.get(key) + "\n");
		}
		
		// Iterator (반복자)
		System.out.println("-------------------------------------------");
		
		Iterator<Integer> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			Integer key = iter.next();
			System.out.print(key + " : ");
			System.out.print(map.get(key) + "\n");
		}
	}

}
