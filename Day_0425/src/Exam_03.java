import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// 키보드로 10진수 입력 -> 2진수로 변환
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10진수 입력 : ");
		int mok = sc.nextInt();
		int na = 0;
		String res = "";
		
		while(mok != 0) {
			na = mok % 2;
			mok = mok /2;
			res = na + res;
		}
		
		System.out.println(res);
	}

}
