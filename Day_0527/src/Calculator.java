// 계산기
public class Calculator {
	void add(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}
	
	void min(int a, int b) {
		System.out.printf("%d - %d = %d\n", a, b, a - b);
	}
	
	void mul(int a, int b) {
		System.out.printf("%d * %d = %d\n", a, b, a * b);
	}
	
	void div(int a, int b) {
		if (b == 0) {
			System.out.println("0 으로 나눌 수 없음");
		} else {
			System.out.printf("%d / %d = %d\n", a, b, a / b);
		}
	}
	
	void na(int a, int b) {
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
	}
	
	void sum(int ... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			
			if (i == (a.length - 1)) {
				System.out.printf("%d = %d\n", a[i], sum);
			} else {
				System.out.printf("%d + ", a[i]);				
			}
		}
		
	}
}
