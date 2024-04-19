import java.util.Scanner;

public class Test_03 {

	public static void main(String[] args) {
		// 번호, 이름, 국어, 영어, 수학 점수를 입력받아 총점, 평균, 판정을 구하는 프로그램
		// 평균은 반올림하여 둘쩨자리까지 출력
		// 판정은 세 과목 모두 60 점 이상, 평균이 80 이상일 경우 합격
		// 불합격 시 불합격 원인도 함께 출력 (과락 또는 평균미만)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생정보입력 : ");
		int bun = sc.nextInt();
		String name = sc.next();
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int math = sc.nextInt();
		
		
		int sum = kr + en + math;
		double avg = (int)(sum / 3.0 * 100 + 0.5) / 100.0;
		
		String res = "합격";
		
		if (kr < 60 || en < 60 || math < 60) {
			res = "불합격(과락)";
		} else if (avg < 80) {
			res = "불합격(평균미만)";
		}
		
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("판정 : " + res);
	}

}
