package com.jslhrd.ccc;

public class Member implements Comparable<Member>{
	private int bun;
	private String name;
	
	public Member(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}

	// 문자열 기준 정렬
//	@Override
//	public int compareTo(Member o) {
//		return name.compareTo(o.name); // 이름을 기준으로 오름차순
////		return o.name.compareTo(name); // 이름을 기준으로 내림차순
//	}
	
	// 숫자 기준 정렬
	@Override
	public int compareTo(Member o) {
		return Integer.compare(bun, o.bun); // 번호를 기준으로 오름차순
//		return Integer.compare(o.bun, bun); // 번호를 기준으로 오름차순
	}
	
	@Override
	public String toString() {
		return bun + " " + name;
	}

	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
