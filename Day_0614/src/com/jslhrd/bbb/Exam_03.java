package com.jslhrd.bbb;

class SuperA {
	
}

class SuperB {
	
}

/*
class SubA extends SuperA, SuperB {
	
}
*/
// => 다중 상속 불가

interface InterA {
	
}

interface InterB {
	
}

class SubInter implements InterA, InterB {
	
}
// => 인터페이스는 여러 개 구현 가능 (상속의 개념 x)

class SubAA extends SuperA implements InterA, InterB {
	
}
// => 다중 상속 구현

public class Exam_03 {

	public static void main(String[] args) {
		
	}

}
