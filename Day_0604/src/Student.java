// 학생기본정보 클래스

public class Student {
	int bun;
	String name;
	int s1;
	int s2;
	int s3;
	int s4;
	int s5;
	
	int max;
	int min;	
	int tot;
	double evg;
	int rank;
	
	Student(){}
	
	Student(int bun, String name, int s1, int s2, int s3, int s4, int s5) {
		this.bun = bun;
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		
		calElse();
	}
	
	void calElse() {
		max = s1;
		min = s1;
		
		if (s2 > max) {
			max = s2;
		} else if (s2 < min) {
			min = s2;
		}
		if (s3 > max) {
			max = s3;
		} else if (s3 < min) {
			min = s3;
		}
		if (s4 > max) {
			max = s4;
		} else if (s4 < min) {
			min = s4;
		}
		if (s5 > max) {
			max = s5;
		} else if (s5 < min) {
			min = s5;
		}
		
		tot = s1 + s2 + s3 + s4 + s5 - max - min;
		evg = (int)(tot / 3.0  * 100 + 0.5) / 100.0;
	}
	
	void subjectPrint(Student[] s, int cnt) {
		StudentPro sp = new StudentPro();
		sp.subject(s, cnt);
		
		System.out.printf("과목별합계 : \t%d\t%d\t%d\t%d\t%d\n", sp.s1_tot, sp.s2_tot, sp.s3_tot, sp.s4_tot, sp.s5_tot);
		System.out.printf("과목별평균 : \t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n", sp.s1_evg, sp.s2_evg, sp.s3_evg, sp.s4_evg, sp.s5_evg);
	}
	
	void print(Student[] s, int cnt) {
		StudentPro sp = new StudentPro();
		sp.rank(s, cnt);
		
		System.out.println("번호\t이름\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수\t최소점수\t합계\t평균\t순위");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\t%d\n", s[i].bun, s[i].name, s[i].s1, s[i].s2, s[i].s3, s[i].s4, s[i].s5, s[i].max, s[i].min, s[i].tot, s[i].evg, s[i].rank);
		}

	}
}
