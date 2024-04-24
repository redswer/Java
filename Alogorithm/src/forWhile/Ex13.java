package forWhile;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* 화폐 단위별 매수 구하기
		 * 급여 : 176668
		 * 50000 원 : 3
		 * 10000 원 : 2
		 * 5000 원 : 1
		 * 1000 원 : 1
		 * 500 원 : 1
		 * 100 원 : 1
		 * 50 원 : 1
		 * 10 원 1
		 * 5 원 : 1
		 * 1 원 : 3
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("급여 : ");
		int na = sc.nextInt();
		
		int dan = 50000;
		int cnt = 0;
		int mok = 0;
		
		while (dan != 0) {
			mok = na / dan;
			na = na % dan;
			System.out.println(dan + " 원 : " + mok);
			
			if (cnt == 0) {
				dan /= 5;
				cnt = 1;
			} else if (cnt == 1) {
				dan /= 2;
				cnt = 0;
			}
		}
	}

}
