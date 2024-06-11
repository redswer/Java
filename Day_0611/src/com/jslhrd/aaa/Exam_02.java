package com.jslhrd.aaa;

class SuparB {
	int a = 10;
}

class ChildB extends SuparB {
	int b = 20;
}

public class Exam_02 {

	public static void main(String[] args) {
		SuparB s = new SuparB(); // => 객체 생성 후 s 가 그 객체의 주소를 참조
		
		ChildB c = new ChildB(); // => 부모 객체 생성 후 상속받아 자식 객체 생성하고 c 가 그 자식 객체의 주소를 참조
	}

}
