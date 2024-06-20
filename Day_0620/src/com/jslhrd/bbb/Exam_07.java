package com.jslhrd.bbb;

import java.util.Arrays;
import java.util.Comparator;

// Arrays
public class Exam_07 {

	public static void main(String[] args) {
		// 복제
		
		int arr[] = {5, 3, 9, 7, 6, 2, 3};
		System.out.println(Arrays.toString(arr));
		
		int cpArr[] = arr.clone();
		System.out.println(Arrays.toString(cpArr));
		
		int arr2[] = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		
		// 정렬
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Integer arr3[] = {5, 3, 9, 4, 6, 2, 3}; // 내림차순 정렬을 위해서는 Integer 로 선언되어 있어야 함
		Arrays.sort(arr3, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr3));
	}

}
