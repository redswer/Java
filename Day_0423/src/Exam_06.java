import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		// 키보드로 자동차번호(4자리), 주차시간 입력받아 주차요금 계산
		// 주차요금은 10분 미만은 무료, 30분까지는 500원, 30분 이후부터는 10분당 500원씩 계산
		// 하루 최대 30000원으로 계산
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 자료 : ");
		int num = sc.nextInt();
		int min = sc.nextInt();
		int charge = 0;

		System.out.println("자동차번호 : " + num);
		
		if (min < 10) {
			System.out.println("주차요금 : 무료");
			System.exit(1);
		} else if (min <= 30) {
			charge = 500;
		} else {
			charge = 500 + ((min - 30) / 10 + 1) * 500;
		}
		
		System.out.println("주차요금 : " + charge + "원");
	}

}
