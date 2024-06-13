package com.jslhrd.bbb;

class ParentA {
	
}

class ChildA extends ParentA {
	
}

public class Exam_05 {

	public static void main(String[] args) {
		ParentA a1 = new ParentA();
		ParentA a2 = new ParentA();
		
		if (a1 == a2) {
			System.out.println("a1 = a2");
		} else {
			System.out.println("a1 != a2");
		}
		
		if (a1.equals(a2)) {
			System.out.println("a1 = a2");
		} else {
			System.out.println("a1 != a2");
		}
		
		// instanceof
		// => 변수명 instanceof 클래스명
		if (a1 instanceof ParentA == a2 instanceof ParentA) {
			System.out.println("a1 = a2");
		} else {
			System.out.println("a1 != a2");
		}
	}

}
