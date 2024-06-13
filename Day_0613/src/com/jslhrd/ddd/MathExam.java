package com.jslhrd.ddd;

public abstract class MathExam {
	// 두 개의 정수 중 큰 수 반환
	public abstract int max(int a, int b);
	
	// 두 개의 정수 중 작은 수 반환
	public abstract int min(int a, int b);
	
	// 여러개의 정수 중 가장 큰 수 반환
	public abstract int max(int ...a);
	
	// 여러개의 정수 중 가장 작은 수 반환
	public abstract int min(int ...a);
}

//Exam_01 이 동작하도록 SubExam 작성
	class SubExam extends MathExam {
		@Override
		public int max(int a, int b) {
			int result = 0;
			
			if (a > b) {
				result = a;
			} else {
				result = b;
			}
			
			return result;
		}
		
		@Override
		public int max(int... a) {
			int result = a[0];
			
			for (int i = 0; i < a.length; i++) {
				if (result < a[i]) {
					result = a[i];
				}
			}
			
			return result;
		}
		
		@Override
		public int min(int a, int b) {
			int result = 0;
			
			if (a > b) {
				result = b;
			} else {
				result = a;
			}
			
			return result;
		}
		
		@Override
		public int min(int... a) {
			int result = a[0];
			
			for (int i = 0; i < a.length; i++) {
				if (result > a[i]) {
					result = a[i];
				}
			}
			
			return result;
		}
	}
