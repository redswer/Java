// 사칙연산을 수행하는 클래스

public class Account {
	void add(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}
	
	void sub(int a, int b) {		
		System.out.printf("%d - %d = %d\n", a, b, a - b);
	}
	
	void mul(int a, int b) {		
		System.out.printf("%d * %d = %d\n", a, b, a * b);
	}
	void div(int a, int b) {		
		System.out.printf("%d / %d = %d\n", a, b, a / b);
	}
}
