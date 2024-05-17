import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		/* 학생정보를 입력받아서 총점, 평균, 석차를 구하여 석차를 기준으로 오름차순 출력
		 * 번호가 0번이거나 학생 10명이 등록되면 종료 후 출력
		 * 평균은 소수점 이하 첫 번째 자리에서 반올림
		 * 
		 * [입력형식]
		 * 학생등록 : 1 김학생 90 88 79
		 * 학생등록 : 5 이학생 95 80 70
		 * 			.
		 * 			.
		 * 학생등록 : 0 -> 입력종료(또는 10명 입력 시)
		 * */
		
		int score[][] = new int[10][7];
		String name[] = new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		// 입력
		while (cnt < 10) {
			System.out.println("학생등록 : ");
			score[cnt][0] = sc.nextInt();
			
			if (score[cnt][0] == 0) {
				break;
			}
			
			name[cnt] = sc.next();
			score[cnt][1] = sc.nextInt();
			score[cnt][2] = sc.nextInt();
			score[cnt][3] = sc.nextInt();
			
			cnt++;
		}
		
		// 총점 & 평균
		for (int i = 0; i < cnt; i++) {
			for (int j = 1; j < score[i].length - 3; j++) {
				score[i][4] += score[i][j];
			}
			
			score[i][5] = (int)(score[i][4] / 3.0 + 0.5);
		}
		
		// 순위
		for (int i = 0; i < cnt; i++) {
			int r = 1;
			for (int j = 0; j < cnt; j++) {
				if (score[i][4] < score[j][4]) {
					r++;
				}
				score[i][6] = r;
			}
		}
		
		// 정렬
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = 1; j < cnt; j++) {
				if (score[i][6] > score[j][6]) {
					int tmp[] = score[i];
					score[i] = score[j];
					score[j] = tmp;
					
					String tmp_name = name[i];
					name[i] = name[j];
					name[j] = tmp_name;
				}
			}
		}
		
		// 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t순위");
		for (int i = 0; i < cnt; i++) {
			System.out.print(score[i][0] + "\t" + name[i] + "\t");
			for (int j = 1; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
