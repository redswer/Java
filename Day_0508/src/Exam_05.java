import java.util.Scanner;

public class Exam_05 {

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
		boolean bool = true;
		
		while(pay != 0) {
			System.out.print(money + " : ");
			
			int mok = pay / money;
			System.out.println(mok);
			
			pay = pay % money;
			if (bool) {
				bool = !bool;
				money = money / 5;
			} else {
				bool = !bool;
				money = money / 2;
			}
		}
	}

}
