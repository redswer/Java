import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// 키보드로 번호, 이름, 국어, 영어, 수학 점수를 입력받아 총점, 평균을 구하여 번호, 이름, 총점, 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 (번호, 이름, 국어, 수학, 영어) : ");
		int bun = sc.nextInt();
		String name = sc.next();
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kr + en + math;
		double avg = sum /3.0;
		
		System.out.println("\n번호\t이름\t총점\t평균");
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(sum + "\t");
		System.out.print(avg + "\t");
	}

}
