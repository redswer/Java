// 키보드로 학번 이름 국어 영어 수학 입력받아 학생 클래스 객체를 생성하여 출력
// 3과목 점수가 40 이상이고, 평균이 60 이상이면 합격
// 불합격 시 이유 출력 (평균 미만 || 과락)

import java.util.Scanner;

class Student {
	int bun;
	String name;
	int kr;
	int en;
	int math;
	int tot;
	double avg;
	boolean pass = true;
	String str = "";
	
	void pass() {
		tot = kr + en + math;
		avg = tot / 3.0;
		
		if (avg < 60) {
			pass = false;
			str = "평균 미만";
		} else if (kr < 40 || en < 40 || math < 40) {
			pass = false;
			str = "과락";
		}
	}
	
	void print() {
		pass();
		
		System.out.print("학번\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t");
		String pass = "합격";
		if (!this.pass) {
			System.out.print("불합격사유\n");
			pass = "불합격";
		} else {
			System.out.println();
		}
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s", bun, name, kr, en, math, tot, avg, pass, str);
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("입력 자료 : ");
		st.bun = sc.nextInt();
		st.name = sc.next();
		st.kr = sc.nextInt();
		st.en = sc.nextInt();
		st.math = sc.nextInt();
		
		st.print();
	}

}
