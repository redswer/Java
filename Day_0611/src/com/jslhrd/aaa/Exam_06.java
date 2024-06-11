package com.jslhrd.aaa;

class SuperF {
	int a = 10;
}

class ChildF extends SuperF {
	int b = 20;
}

class SubChildF extends ChildF {
	int c = 30;
}

final class ChildFF extends SuperF {
// => final 사용하면 더 이상의 상속 불가능
	int b = 20;
}
//class SubChildFF extends ChildFF {
//	int c = 30;
//}

public class Exam_06 {

	public static void main(String[] args) {
		
	}

}
