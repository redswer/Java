import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// 키보드로 10진수 입력 2, 8, 16진수 변환
		// 입력값이 0 이면 종료
		// 입력값이 1보다 작으면 "오류" 출력 후 재입력
		// 변환진수가 2, 8, 16 이외의 값은 "오류" 출력 후 재입력
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("10 진수 : ");
			int dec = sc.nextInt();
			
			if (dec == 0) {
				break;
			}
			
			System.out.print("변환진수 : ");
			int ch = sc.nextInt();
			
			if (ch != 2 && ch != 8 && ch!= 16) {
				System.out.println("오류입니다.");
				continue;
			}
			
			int mok = dec;
			int na = 0;
			String str = "";
			
			while (mok != 0) {		
				mok = dec / ch;
				na = dec % ch;
				
				if (ch == 16) {
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
				} else {
					str = na + str;
				}
				dec = mok;
			}
			System.out.println(ch +"진수 : " + str); 
		} // while
		
		System.out.println("프로그램을 종료합니다.");
	} // main

} // class
