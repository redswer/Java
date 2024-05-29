import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		// 입력형식 [번호 이름 국어 영어 수학]
		// 학생등록 : 7 이학생 78 90 80
		// => 입력 종료 또는 10명 등록 완료 시 출력
		
		// 출력형식
		// 번호 이름 국어 영어 수학 총점 평균 학점
		// => 평균은 반올림하여 소수 둘째자리까지 출력
		// => 학점은 100~90 : A, 89 ~ 80 : B, 79 ~ 70 : C, 69 ~ 60 : D, 59~0 : F 출력
		
		// 최고 총점, 최소 총점 학생 출력
		
		Scanner sc = new Scanner(System.in);
		Student st[] = new Student[10];
		Student s = new Student();
		int cnt = 0;
		
		for (int i = 0; i < st.length; i++) {
			System.out.print("학생등록 : ");
			int bun = sc.nextInt();
			
			if (bun == 0) {
				break;
			}
			
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			
			st[cnt] = new Student(bun, name, kor, eng, math);
			
			cnt++;
		}
		
		s.print(st, cnt);
		s.maxMinPrint(st, cnt);
	}

}
