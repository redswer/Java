package com.jslhrd.util;

public class NumberSortExam extends NumberSort {
	
	public NumberSortExam(int[] num) {
		super(num);
	}

	@Override
	public void ascSort() {
		for (int i = 0; i < super.number.length - 1; i++) {
			for (int j = i + 1; j < super.number.length; j++) {
				if(super.number[i] > super.number[j]) {
					int tmp = super.number[i];
					super.number[i] = super.number[j];
					super.number[j] = tmp;
				}
			}
		}
		
		System.out.print("오름차순 : ");
		super.dataPrint();
	}
	
	@Override
	public void descSort() {
		for (int i = 0; i < super.number.length - 1; i++) {
			for (int j = i + 1; j < super.number.length; j++) {
				if(super.number[i] < super.number[j]) {
					int tmp = super.number[i];
					super.number[i] = super.number[j];
					super.number[j] = tmp;
				}
			}
		}
		
		System.out.print("내림차순 : ");
		super.dataPrint();
	}
	
	@Override
	public int maxMinTotal() {
		int max = super.number[0];
		int min = super.number[0];
		int tot = 0;
		
		for (int i = 0; i < super.number.length; i++) {
			if (max < super.number[i]) {
				max = super.number[i];
			} else if (min > super.number[i]) {
				min = super.number[i];
			}
			
			tot += super.number[i];
		}
		
		tot = tot - max - min;
		
		return tot;
	}
}
