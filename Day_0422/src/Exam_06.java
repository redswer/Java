import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// 키보드로 번호 이름 국어 영어 수학 입력 후 총점 평균 판정을 구하여 출력 (평균 80 이상 "합격" 아니면 "불합격")
		
		/* [입력형식]
		 * 성적입력 : 1 김학생 90 88 79
		 * 
		 * [출력형식]
		 * 번호 : 1
		 * 이름 : 김학생
		 * 총점 : xxx
		 * 평균 : xxx
		 * 판정 : xx
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적입력 : ");
		int bun = sc.nextInt();
		String name = sc.next();
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kr + en + math;
		double avg = (int) (sum / 3.0 * 100 + 0.5) / 100.0;
		
		String s = "";
		if (avg >= 80) {
			s = "합격";
		} else {
			s = "불합격";
		}
		
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("판정 : " + s);
	}

}
