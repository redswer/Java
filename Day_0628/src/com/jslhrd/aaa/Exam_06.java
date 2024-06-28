package com.jslhrd.aaa;

import java.util.*;

public class Exam_06 {

	public static void main(String[] args) {
		Map<Person, Integer> map = new HashMap<>();
		
		map.put(new Person(1, "aaa"), 90);
		map.put(new Person(2, "bbb"), 80);
		map.put(new Person(3, "ccc"), 90);
		map.put(new Person(5, "ddd"), 85);
		map.put(new Person(4, "sss"), 88);
		
		/* 번호 이름 점수 */
		
		Set<Map.Entry<Person, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Person, Integer>> iter = set.iterator();
		
		int tot = 0;
		
		System.out.println("번호\t이름\t점수");
		while(iter.hasNext()) {
			Map.Entry<Person, Integer> m = iter.next();
			
			tot += m.getValue();
			System.out.print(m.getKey() + "\t");
			System.out.print(m.getValue() + "\n");
		}
		
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + (double)tot / set.size());
	}

}
