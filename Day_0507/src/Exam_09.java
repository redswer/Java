import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		/* 키보드로 10진수 입력받아 2진수 출력
		 * Exam_08 + 2진수는 배열에 저장 후 출력
		 * */
		
		Scanner sc = new Scanner(System.in);

		int dec = 0;
		int bin[] = new int[10];

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
		
		int cnt = 0;
		while (dec != 0) {
			int na = dec % 2;
			bin[cnt] = na;
			dec = dec / 2;
			cnt++;
		}
		
		for(int i = cnt - 1; i >= 0; i--) {
			System.out.print(bin[i]);
		}
	}

}
