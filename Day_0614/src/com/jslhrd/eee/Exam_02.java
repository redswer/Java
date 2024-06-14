package com.jslhrd.eee;

class AA {
	void div(int a, int b) {
		try {
			int res = a / b;
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

public class Exam_02 {

	public static void main(String[] args) {
		AA aa = new AA();
		
		aa.div(10, 5);
		
		aa.div(10, 0);
		
	}

}
