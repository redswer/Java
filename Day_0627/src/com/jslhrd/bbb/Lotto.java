package com.jslhrd.bbb;

import java.util.*;

// 난수 생성 (Random 클래스, Math.random())
public class Lotto {
	Random r = new Random();
	
	// 1. 배열 이용
	public void arrayLotto() {
		
		int lotto[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("arrayLotto : " + Arrays.toString(lotto));
		Arrays.sort(lotto);
		System.out.println("arrayLotto(sort) : " + Arrays.toString(lotto));
	}
	
	// 2. list 의 ArrayList 이용
	public void listLotto() {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;
				if (list.contains(num)) {
					i--;
				} else {
					list.add(num);
				}
		}
		
		System.out.println("listLotto : " + list);
		Collections.sort(list);
		System.out.println("listLotto(sort) : " + list);
	}
	
	// 3. set 의 HashSet 이용
	public void setLotto() {
		Set<Integer> set = new HashSet<>();
		
		for (;set.size() < 6;) {
			int num = r.nextInt(45) + 1;
			set.add(num);
		}
		
		System.out.println("setLotto : " + set);
		
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.println("setLotto(sort) : " + list);
	}
	
	// 6개 뽑기
	public void examListLotto() {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= 45; i++) {
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		int num[] = new int[6];
		
		for (int i = 0; i < 6; i++) {
			num[i] = list.get(i);
		}
		
		System.out.println("examListLotto : " + Arrays.toString(num));
		Arrays.sort(num);
		System.out.println("examLiostLotto(sort)" + Arrays.toString(num));
	}
}