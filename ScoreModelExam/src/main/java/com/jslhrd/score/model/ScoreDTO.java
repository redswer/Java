package com.jslhrd.score.model;

public class ScoreDTO {
	private int kor;
	private int eng;
	private int mat;
	
	private String grade;
	private double kor_avg;
	private double eng_avg;
	private double mat_avg;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getKor_avg() {
		return kor_avg;
	}
	public void setKor_avg(double kor_avg) {
		this.kor_avg = kor_avg;
	}
	public double getEng_avg() {
		return eng_avg;
	}
	public void setEng_avg(double eng_avg) {
		this.eng_avg = eng_avg;
	}
	public double getMat_avg() {
		return mat_avg;
	}
	public void setMat_avg(double mat_avg) {
		this.mat_avg = mat_avg;
	}
}
