package com.jslhrd.aaa;

public class Exam_02 {

	public static void main(String[] args) {
		BB b1 = new BB();
//		b1.bun = 1;
//		b1.name = "aaa";
//		b1.age = 25;
		// => BB 에서 변수를 private 이 아닌 default 로 생성하면 변수에 접근 가능 (보안 이슈)
		
		BB b2 = new BB(3, "bbb", 30);
		// => BB 에서 변수를 private 으로 선언하면 잘못 입력된 값을 수정 불가능
		
		b2.setBun(5);
		System.out.println(b2.getBun());
		// => setter 를 이용해 수정하고 getter 를 이용해 값을 호출
	}

}
