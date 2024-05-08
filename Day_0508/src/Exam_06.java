import java.util.Scanner;

public class Exam_06 {

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
		
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		for (int i = 0; i < money.length; i++) {
			System.out.print(money[i] + " : ");
			int mok = pay / money[i];
			System.out.println(mok);
			
			int na = pay % money[i];
			pay = na;
			
			if (pay == 0) {
				break;
			}
		}
	}

}
