package model;

public class StudentDTO {
	private String syear;
	private String sclass;
	private String sno;
	private String sname;
	private String birth;
	private String gender;
	private String tel1;
	private String tel2;
	private String tel3;
	
	// score
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	// dept
	private String tname;
	private int class_k_tot;
	private int class_e_tot;
	private int class_m_tot;
	private double class_k_avg;
	private double class_e_avg;
	private double class_m_avg;
	
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
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
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getClass_k_tot() {
		return class_k_tot;
	}
	public void setClass_k_tot(int class_k_tot) {
		this.class_k_tot = class_k_tot;
	}
	public int getClass_e_tot() {
		return class_e_tot;
	}
	public void setClass_e_tot(int class_e_tot) {
		this.class_e_tot = class_e_tot;
	}
	public int getClass_m_tot() {
		return class_m_tot;
	}
	public void setClass_m_tot(int calss_m_tot) {
		this.class_m_tot = calss_m_tot;
	}
	public double getClass_k_avg() {
		return class_k_avg;
	}
	public void setClass_k_avg(double class_k_avg) {
		this.class_k_avg = class_k_avg;
	}
	public double getClass_e_avg() {
		return class_e_avg;
	}
	public void setClass_e_avg(double class_e_avg) {
		this.class_e_avg = class_e_avg;
	}
	public double getClass_m_avg() {
		return class_m_avg;
	}
	public void setClass_m_avg(double class_m_avg) {
		this.class_m_avg = class_m_avg;
	}
}
