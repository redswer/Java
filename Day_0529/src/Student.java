
public class Student {
	int bun;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	
	Student() {
	}
	
	Student(int bun, String name, int kor, int eng, int math) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = kor + eng + math;
		this.avg = (int)(tot / 3.0 * 100 + 0.5) / 100.0;
		
		char grade;
		
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		this.grade = grade;
	}
	
	void print(Student[] s, int cnt) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", s[i].bun, s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].tot, s[i].avg, s[i].grade);
		}
	}
	
	void maxMinPrint(Student[] s, int cnt) {
		Student max = s[0];
		Student min = s[0];
		
		for (int i = 0; i < cnt; i++) {
			if (s[i].tot > max.tot) {
				max = s[i];
			} else if (s[i].tot < min.tot) {
				min = s[i];
			}
		}
		
		System.out.println("최고 총점 학생 : " + max.name + ", " + max.tot + "점");
		System.out.println("최소 총점 학생 : " + min.name + ", " + min.tot + "점");
	}
}
