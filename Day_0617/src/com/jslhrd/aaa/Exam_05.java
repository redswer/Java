package com.jslhrd.aaa;

import java.util.Scanner;

class DD {
	int bun;
	String name;
	
	DD(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return bun + "번, " + name;
	}
}

public class Exam_05 {

	public static void main(String[] args) {
		String str = new String("AAA");
		System.out.println("str : " + str);
		
		DD dd = new DD(1, "aaaa");
		System.out.println("dd : " + dd);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("scanner : " + sc);
		
		// => String 이 주소가 아니라 문자열이 출력되는 이유는 문자열을 출력하도록 overriding 되어있기 때문 (toString())
	}

}
