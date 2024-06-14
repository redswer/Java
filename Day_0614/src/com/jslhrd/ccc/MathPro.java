package com.jslhrd.ccc;

public interface MathPro {
	int sum(int n, int m); // n ~ m 까지의 합
	
	String binaryStr(int num); // 10진수를 2진수로 변환
	
	int[] binaryArr(int num); // 10진수를 2진수로 변환
	
	void priNumber(int n); // 2 ~ num 까지 소수를 출력
	
	void numberScore(int ...n); // 점수 중에서 최대, 최소, 합계 구하여 출력
}
