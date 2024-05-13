import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		/* 키보드로 학생의 점수를 입력받아서 내림차순으로 정렬하여 출력
		 * 점수는 최대 10개, 0이 입력되면 종료
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[10];
		int cnt = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + ".점수 : ");
			score[i] = sc.nextInt();
			
			if(score[i] == 0) {
				break;
			}
			
			cnt++;
		}
		
		System.out.print("학생점수 : ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d ", score[i]);
		}
		
		for (int i = 0; i < cnt; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (score[j] > score[i]) {
					int tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		System.out.println();
		System.out.print("내림차순 : ");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%d ", score[i]);
		}
	}

}
