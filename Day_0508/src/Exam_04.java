import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		/* 급여 : 176668
		 * 
		 * 50000원 : 3
		 * 10000원 : 2
		 * 5000원 : 1
		 * 1000원 : 1
		 * 500원 : 1
		 * 100원 : 1
		 * 50원 : 1
		 * 10원 : 1
		 * 5원 : 1
		 * 1원 : 3
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("급여 : ");
		int pay = sc.nextInt();
		
		int money = 50000;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(money + " : ");
			int mok = pay / money;
			System.out.println(mok);
			
			int na = pay % money;
			pay = na;
			
			if (i % 2 == 1) {
				money = money / 5;
			} else {
				money = money / 2;
			}
			
			if (pay == 0) {
				break;
			}
		}
	}

}
