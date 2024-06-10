package com.jslhrd.bbb;

//import com.jslhrd.aaa.AA;
import com.jslhrd.aaa.*;
// => aaa 패키지 안의 모든 클래스 import

public class Exam_02 {

	public static void main(String[] args) {
		AA aa = new AA();
		// => AA 는 public 으로 선언했지만, 다른 패키지에서 호출할 때는 import 필요
		
//		aa.a = 100; //=> private : 다른 클래스에서 접근 불가
//		aa.b = 200; //=> default : 다른 패키지에서 접근 불가
//		aa.c = 300; //=> protected : 다른 패키지에서 접근 불가 (상속 관계에서는 패키지가 달라도 접근 가능)
		aa.d = 400; //=> public
	}

}
