package com.jslhrd.bbb;

class A {
	
}

class SubA extends A {
	
}

public class Exam_04 {

	public static void main(String[] args) {
		A a1 = new A();
		
		A a2 = new SubA();
		// => 업캐스팅(UPCasting)
		// => 조상 클래스를 이용하여 자식 객체를 생성할 수 있음
		
//		SubA sa = a1; // => 컴파일 오류
//		SubA sa = (SubA) a1; // => 런타임 오류
		
		SubA sa = (SubA) a2;
		// => 다운캐스팅
		// => a2 는 SubA 생성자로 생성했기 때문에 A 에서 SubA 로 다운캐스팅 가능
		
		SubA s1 = new SubA();
		A a3 = s1;
		SubA s2 = (SubA) a3;
	}

}
