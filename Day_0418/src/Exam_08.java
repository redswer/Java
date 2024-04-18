import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// 키보드로 이름, 국어, 영어, 수학 입력받아 출력
		// 평균은 소수 이하 셋째자리에서 반올림, 판정은 평균 80 이상이면 합격
		/*	[입력]
		 * 		학생자료입력 : 김학생  90  88  79
		 *  [출력]
		 *  	이름   총점   평균   판정
		 *  	김학생  257  85.67  합격
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생자료입력 : ");
		String name = sc.next();
		int kr = Integer.parseInt(sc.next());
		int en = Integer.parseInt(sc.next());
		int math = Integer.parseInt(sc.next());
		
		int sum = kr + en + math;
		double avg = (int)(sum / 3.0 * 100 + 0.5) / 100.0;
		
		String res = avg >= 80 ? "합격" : "불합격";
		
		System.out.println("이름\t총점\t평균\t판정");
		System.out.printf("%s\t%d\t%.2f\t%s", name, sum, avg, res);
	}

}
