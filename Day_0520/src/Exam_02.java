import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		/* 학생정보를 입력받아서 최대, 최소, 합계 평균값을 구하여 출력하는 프로그램 작성
		 * 학생의 최대인원은 10명
		 * 총점은 최대, 최소값을 뺀 점수의 합
		 * 번호가 0 이 입력되거나 10명의 등록이 완료되면 종료
		 * 형균은 소수점 이하 첫 번째 자리에서 반올림하여 정수로 출력
		 * 
		 * [입력형식] (번호 점수1 점수2 점수3 점수4 점수5)
		 *  학생등록 : 1 90 88 79 97 80
		 *  학생등록 : 5 95 80 70 77 90
		 *  학생등록 : 2 88 78 90 67 90
		 *  			.
		 *  			.
		 *  			.
		 *  학생등록 : 0 -> 입력종료
		 *  
		 *  [출력형식1] (입력 자료순)
		 *  *** 학생 입력자료 ***
		 *  번호   점수1   점수2   점수3   점수4   점수5   최대점수   최소점수   총점   평균
		 *  
		 *  [출력형식2] (총점을 기준으로 내림차순 정렬 후 출력)
		 *  *** 성적알림표 ***
		 *  번호   점수1   점수2   점수3   점수4   점수5   최대점수   최소점수   총점   평균   순위
		 * */
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		int score[][] = new int[10][11];
		int cnt = 0;

		while (cnt <= 10) {
			System.out.print("학생등록 : ");
			score[cnt][0] = sc.nextInt();
			
			if (score[cnt][0] == 0) {
				break;
			}
			
			score[cnt][1] = sc.nextInt();
			score[cnt][2] = sc.nextInt();
			score[cnt][3] = sc.nextInt();
			score[cnt][4] = sc.nextInt();
			score[cnt][5] = sc.nextInt();
			
			int max = score[cnt][1];
			int min = score[cnt][1];
			int sum = 0;
			
			for (int i = 1; i <= 5; i++) {
				if (score[cnt][i] > max) {
					max = score[cnt][i];
				} else if (score[cnt][i] < min) {
					min = score[cnt][i];
				}
				
				sum += score[cnt][i];
			}
			
			score[cnt][6] = max;
			score[cnt][7] = min;
			score[cnt][8] = sum - max - min;
			score[cnt][9] = (int)(score[cnt][8] / 3.0 + 0.5);
			
			cnt++;
		}
		
		// 출력 1
		System.out.println("*** 학생 입력자료 ***");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수\t최소점수\t총점\t평균");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 순위 구하기
		for (int i = 0; i < cnt; i++) {
			int r = 1;
			for (int j = 0; j < cnt; j++) {
				if (score[i][8] < score[j][8]) {
					r++;
				}
			}
			score[i][10] = r;
		}
		
		// 순위 순 정렬
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = 1; j < cnt; j++) {
				if (score[i][10] > score[j][10]) {
					int tmp[] = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		// 출력 2
		System.out.println("*** 성적알림표 ***");
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수\t최소점수\t총점\t평균\t순위");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
