import java.util.Scanner;

public class Student {
	String school = "oo대학교";
	int bun;
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	// 입력
	void student(int bun, String name, int kor, int eng, int math) {
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		cal();
		print();
	}
	
	// 키보드 입력 (Exam_10)
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생등록 : ");
		bun = sc.nextInt();
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		cal();
	}
	
	// 총점, 평균 계산
	void cal() {
		sum = kor + eng + math;
		avg = sum / 3.0;
	}
	
	// 출력
	void print() {
		System.out.printf("%s\t", school);
		System.out.printf("%d\t", bun);
		System.out.printf("%s\t", name);
		System.out.printf("%d\t", kor);
		System.out.printf("%d\t", eng);
		System.out.printf("%d\t", math);
		System.out.printf("%d\t", sum);
		System.out.printf("%f\t\n", avg);
	}
}
