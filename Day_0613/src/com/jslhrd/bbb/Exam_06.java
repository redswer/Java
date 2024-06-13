package com.jslhrd.bbb;

class D {
	
}

class SubD extends D {
	
}

public class Exam_06 {

	public static void main(String[] args) {
		D d1 = new D();
		D d2 = new SubD();
		
		if (d1 instanceof SubD) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		System.out.println("-------------------------");
		
		if (d2 instanceof SubD) {
			System.out.println("같은 객체");
			SubD dd = (SubD) d2;
			// => 다운캐스팅이나 업캐스팅을 할 때 instanceof 를 이용하여 확인 후 진행
		} else {
			System.out.println("다른 객체");
		}
	}

}
