package com.jslhrd.bbb;
// 영문자의 발생 빈도 수 구하기
/* [입력 예시]
 * 단어 : Apple
 * 단어 : Seoul
 * . . . . 
 * 단어 : end(END) => 종료
 * 
 * [출력 예시]
 * A  B  C  D  ...  Z
 * 0  2  1  0       1
 * 
 * 가장 많이 사용된 문자 : B(2)
 * */

import java.util.Scanner;

class Alpha {
	Scanner sc = new Scanner(System.in);
	String word = "";
	char al = 0;
	int[] alpha = new int[26];
	
	void input() {
		while (true) {
			System.out.print("단어 : ");
			word = sc.next().toUpperCase();
			
			if (word.equals("END")) {
				break;
			}
			
			for (int i = 0; i < word.length(); i++) {
				al = word.charAt(i);
				alpha[al - 65]++;
			}
		}
	}
	
	void print() {
		for (int i = 0; i < alpha.length; i++) {
			al = (char) (i + 65);
			System.out.print(al + "\t");
		}
		System.out.println();
		for (int i = 0; i < alpha.length; i++) {
			System.out.print(alpha[i] + "\t");
		}
		
		System.out.println();
		System.out.println();
		System.out.print("가장 많이 사용된 문자 : ");
		int max = alpha[0];
		al = 65;
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i] > max) {
				max = alpha[i];
				al = (char) (i + 65);
			}
		}
		System.out.print(al + "(" + max + ")");
	}
}

public class AlphaExam {

	public static void main(String[] args) {
		Alpha alpha = new Alpha();
		alpha.input();
		alpha.print();
	}

}
