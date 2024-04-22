import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		// 번호 국어 영어 수학 입력받은 후 총점, 평균, 학점을 구하여 출력 (학점은 100 ~ 93 = A, 92 ~ 85 = B, 84 ~ 70 = C, 69 ~55 = D, 나머지는 F)
		/* [입력]
		 * 정보입력 : 1 90 80 90 
		 * [출력]
		 * 번호 : 1
		 * 총점 : xxx
		 * 평균 : xxx
		 * 학점 : x
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정보입력 : ");
		int bun = sc.nextInt();
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kr + en + math;
		double avg = sum / 3.0;
		String grade = "F";
				
		if (avg >= 93) {
			grade = "a";
		} else if (avg >= 85) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 55) {
			grade = "D";
		}
		
		System.out.println("번호 : " + bun);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
	}

}
