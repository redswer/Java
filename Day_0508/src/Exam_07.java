import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		/* 키보드로 급여를 입력받아 화폐매수 계산(최대인원은 10명)
		 * 
		 * [입력예시]
		 * 급여 : 178900
		 * 급여 : 234567
		 * 급여 : 123456
		 * 급여 : 0
		 * 
		 * [출력예시]
		 * 급여		오만 일만 오천 일천 오백 일백 오십 일십 오 일
		 * 178900	 3	2	.	.	.	.	.	.	.
		 * 234567    4	3	.	.	.	.	.	.	.
		 * 123456	 2	2	.	.	.	.	.	.	.
		 * 합계		 9	7	.	.	.	.	.	.	.
		 * */
		
		int pay[] = new int[10];
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int money_count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < pay.length; i++) {
			System.out.print("급여 : ");
			pay[i] = sc.nextInt();
			if(pay[i] == 0) {
				break;
			}
		}
		
		System.out.printf("급여\t오만\t일만\t오천\t일천\t오백\t일백\t오십\t일십\t오\t일\n");
		for (int i = 0; i < pay.length; i++) {
			if (pay[i] == 0) {
				break;
			}
			
			System.out.printf("%d\t", pay[i]);
			int pay_i = pay[i];
			for (int j = 0; j < money.length; j++) {
				int mok = pay_i / money[j];
				int na = pay_i % money[j];
				pay_i = na;
				money_count[j] += mok;
				
				System.out.printf("%d\t", mok);
			}
			System.out.println();
		}
		
		System.out.print("합계 :\t");
		for(int i : money_count) {
			System.out.printf("%d\t", i);
		}

	}

}
