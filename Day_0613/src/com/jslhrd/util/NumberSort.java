package com.jslhrd.util;

public abstract class NumberSort {
	int[] number;
	
	public NumberSort(int[] num) {
		number = num;
	}
	
	public void dataPrint() {
		System.out.print("Data : ");
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "\t");
		}
		
		System.out.println();
	}
	
	//data 오름차순 정렬
	public abstract void ascSort();
	
	// data 내림차순 정렬
	public abstract void descSort();
	
	// 최대 최소를 뺀 나머지 합계 출력
	public abstract int maxMinTotal();
}
