package com.jslhrd.ddd;
// 계산기 기본기능 명시
public interface Cal {
	void add(int a, int b); // +
	void sub(int a, int b); // -
	void mul(int a, int b); // *
	void div(int a, int b); // /
	void rem(int a, int b); // %
}
