import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		/* 키보드로 10진수 입력받아 2진수 출력
		 * 1. 10진수 입력값은 1024 미만으로 함
		 * [예시]
		 * 10진수 : 10
		 * 2진수 : 1010
		 * 
		 * 10진수 : 1200
		 * 입력오류
		 * */
		
		Scanner sc = new Scanner(System.in);

		int dec = 0;
		String bin = "";

		while(true) {
			System.out.print("10진수 : ");
			dec = sc.nextInt();
			
			if (dec > 1024 || dec < 1) {
				System.out.println("입력오류");
				continue;
			} else {
				break;
			}

		}
		
		while (dec != 0) {
			int na = dec % 2;
			bin = na + bin;
			dec = dec / 2;
		}
		System.out.println("2진수 : " + bin);
	}

}
