package com.jslhrd.exshop.model;

public class CommonDTO {
	MemberDTO member;
	MoneyDTO money;
	CityDTO city;
	
	public MemberDTO getMember() {
		return member;
	}
	public void setMember(MemberDTO member) {
		this.member = member;
	}
	public MoneyDTO getMoney() {
		return money;
	}
	public void setMoney(MoneyDTO money) {
		this.money = money;
	}
	public CityDTO getCity() {
		return city;
	}
	public void setCity(CityDTO city) {
		this.city = city;
	}
}
