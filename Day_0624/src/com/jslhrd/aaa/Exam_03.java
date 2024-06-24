package com.jslhrd.aaa;

import java.util.*;

public class Exam_03 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		while (list.size() < 10) {
			System.out.print("입력 : ");
			String name = sc.next();
			
			// contains() : 데이터 확인
			if (list.contains(name)) {
				System.out.println("중복");
			} else {
				list.add(name);
				System.out.println("등록");
			}
		}
		
		System.out.println(list);
	}

}
