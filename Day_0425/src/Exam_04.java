import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// 키보드로 10진수 입력받아 2진수로 변환
		/* 
		 * 10진수 : 25
		 * 2진수 : 11001
		 * 
		 * 10진수 : 10
		 * 2진수 : 1010
		 * 
		 * 10진수 : 7
		 * 2진수 : 111
		 * 
		 * 10진수 : 0
		 * 프로그램 종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("10 진수 : ");
			int dec = sc.nextInt();
			
			if (dec == 0) {
				break;
			}
			
			int mok = dec;
			int na = 0;
			String res = "";
			
			while (mok != 0) {
				na = mok % 2;
				mok = mok / 2;
				res = na + res;
			}
			
			System.out.println("2진수 : " + res);
		}
		
		System.out.println("프로그램 종료");
	}

}
