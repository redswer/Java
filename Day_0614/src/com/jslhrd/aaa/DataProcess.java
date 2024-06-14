package com.jslhrd.aaa;

public class DataProcess implements Process {

	@Override
	public int max(int a, int b) {
		int max = a;
		
		if (b > a) {
			max = b;
		}
		
		return max;
	}

	@Override
	public int min(int a, int b) {
		int min = a;
		
		if (b < a) {
			min = b;
		}
		
		return min;
	}

	@Override
	public int max(int... a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		
		return max;
	}

	@Override
	public int min(int... a) {
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		
		return min;
	}

}
