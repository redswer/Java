import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		/* 키보드로 10진수 입력, 2 8 16 진수로 변환
		 * 1. 입력값이 0 이면 종료
		 * 2. 입력값이 1보다 작으면 "오류" 출력 후 재입력
		 * 3. 변환진수가 2 8 16 이외의 값이면 "오류" 출력 후 재입력
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int dec = 0;
		int na = 0;
		
		while(true) {
			System.out.print("10진수 : ");
			dec = sc.nextInt();
			
			if (dec == 0) {
				break;
			} else if (dec < 1) {
				System.out.println("오류");
				continue;
			}
			
			System.out.print("진수 : ");
			int ch = sc.nextInt();
			
			if (ch != 2 && ch != 8 && ch != 16) {
				System.out.println("오류");
				continue;
			}
			
			String str = "";
			
			while (dec != 0) {
				na = dec % ch;
				dec = dec / ch;
				
				switch (na) {
				case 10:
					str = "A" + str;
					break;
				case 11:
					str = "B" + str;
					break;
				case 12:
					str = "C" + str;
					break;
				case 13:
					str = "D" + str;
					break;
				case 14:
					str = "E" + str;
					break;
				case 15:
					str = "F" + str;
					break;
				default:
					str = na + str;
					break;
				}
			}
			System.out.println(ch + "진수 : " + str);
		}
		System.out.println("프로그램 종료");
	}

}
