package com.jslhrd.ddd;

public class Calculator implements Cal {

	@Override
	public void add(int a, int b) {
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.printf("%d - %d = %d\n", a, b, (a - b));
	}

	@Override
	public void mul(int a, int b) {
		System.out.printf("%d * %d = %d\n", a, b, (a * b));
	}

	@Override
	public void div(int a, int b) {
		if (b == 0) {
			System.out.println("!오류 : 0으로 나눌 수 없습니다.");
		} else {
			System.out.printf("%d / %d = %f\n", a, b, (a / (double)b));
		}
	}

	@Override
	public void rem(int a, int b) {
		System.out.printf("%d %% %d = %d\n", a, b, (a % b));
	}
	
	// 추가
	public void add(int...a) {
		int tot = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				System.out.printf("%d + ", a[i]);
			} else {
				System.out.printf("%d = ", a[i]);
			}
			tot += a[i];
		}
		System.out.print(tot + "\n");
	}
	
	// 여러 개 빼기
	public void sub(int...a) {
		int result = a[0];
		
		System.out.print(a[0]);
		for (int i = 1; i < a.length; i++) {
			System.out.printf(" - %d", a[i]);
			result -= a[i];
		}
		
		System.out.printf(" = %d\n", result);
	}
	
	// 여러 개 곱하기
	public void mul(int...a) {
		int tot = 1;
		
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				System.out.printf("%d * ", a[i]);
			} else {
				System.out.printf("%d = ", a[i]);
			}
			
			tot *= a[i];
		}
		
		System.out.printf("%d\n", tot);
	}
	
}
