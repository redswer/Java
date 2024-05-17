
public class Exam_06 {

	public static void main(String[] args) {
		/* 번호   국어   영어   수학   총점   순위
		 *  5	 90    88   78    0     0
		 *  2	 90	   85	80	  0     0
		 *  1	 80	   70   90    0     0
		 *  3    95    90   85    0     0
		 *  4    88    78   90    0     0
		 * */
		
		// 1. 총점, 순위를 구하여 출려하는 프로그램 작성 (번호를 기준으로 오름차순 출력)
		// 2. 총점이 가장 높은 학생, 가장 낮은 학생을 찾아서 출력
		
		int score[][] = {{5, 90, 88, 78, 0, 0},
						{2, 90, 85, 80, 0, 0},
						{1, 80, 70, 90, 0, 0},
						{3, 95, 90, 85, 0, 0},
						{4, 88, 78, 90, 0, 0}};
		
		// 총점
		for (int i = 0; i < score.length; i++) {
			for (int j = 1; j < score[i].length - 2; j++) {
				score[i][4] += score[i][j];
			}
		}
		
		// 순위
		for (int i = 0; i < score.length; i++) {
			int r = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i][4] < score[j][4]) {
					r++;
				}
				score[i][5] = r;
			}
		}
		
		// 정렬
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i][0] > score[j][0]) {
					int tmp[] = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		
		// 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("------------------------------------------------------");
		
		// 2.
		int first[] = score[0];
		int last[] = score[0];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][4] > first[4]) {
					first = score[i];
				} else if (score[i][4] < last[4]) {
					last = score[i];
				}
			}
		}
		
		System.out.println("총점이 가장 높은 학생 : ");
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for (int i = 0; i < first.length; i++) {
			System.out.print(first[i] + "\t");
		}
		
		System.out.println("\n");
		
		System.out.println("총점이 가장 낮은 학생 : ");
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for (int i = 0; i < last.length; i++) {
			System.out.print(last[i] + "\t");
		}
	}

}
