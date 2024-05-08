import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		/* 키보드로 학생 점수를 입력받아 점수대별 인원수 출력
		 * -99가 입력될 경우 종료
		 * [입력예시]
		 * 점수 : 88 79 90 79 80 75 60 80 55 57 90 74 -99
		 * [출력예시]
		 * 100~90 : 
		 * 89~80 : 
		 * 79~70 :
		 * 69~60 :
		 * 59~50 :
		 * 49~0 :
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int cnt_9 = 0;
		int cnt_8 = 0;
		int cnt_7 = 0;
		int cnt_6 = 0;
		int cnt_5 = 0;
		int cnt_0 = 0;
		
		System.out.print("점수 : ");
		while(true) {
			int score = sc.nextInt();
			if (score == -99) {
				break;
			}
			
			switch (score / 10) {
			case 10:
			case 9:
				cnt_9++;
				break;

			case 8:
				cnt_8++;
				break;
			case 7:
				cnt_7++;
				break;
			case 6:
				cnt_6++;
				break;
			case 5:
				cnt_5++;
				break;
			default:
				cnt_0++;
				break;
			}
		}
		
		System.out.println("100 ~ 90 : " + cnt_9);
		System.out.println("89 ~ 80 : " + cnt_8);
		System.out.println("79 ~ 70 : " + cnt_7);
		System.out.println("69 ~ 60 : " + cnt_6);
		System.out.println("59 ~ 50 : " + cnt_5);
		System.out.println("49 ~ 0 : " + cnt_0);

	}

}
