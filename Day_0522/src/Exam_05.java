import java.util.Scanner;

public class Exam_05 {
	static int input(int[][] student) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		
		for (cnt = 0; cnt < 10; cnt++) {
			int sum = 0;
			System.out.print("학생정보 : ");
			for (int i = 0; i < 4; i++) {
				student[cnt][i] = sc.nextInt();
				
				if (student[cnt][0] == 0) {
					break;
				}
				
				if (i != 0) {
					sum += student[cnt][i];					
				}
			}
			student[cnt][4] = sum;
			
			if (student[cnt][0] == 0) {
				break;
			}
		}
		
		return cnt;
	}
	
	static void grade(int[][] student, int cnt) {
		for (int i = 0; i < cnt; i++) {
			student[i][5] = 1;
			for (int j = 0; j < cnt; j++) {
				if (student[i][4] < student[j][4]) {
					student[i][5]++;
				}
			}
		}
	}
	
	static void sort(int[][] student, int cnt) {
		for (int i = 0; i < cnt - 1; i++) {
			for (int j = i + 1; j < cnt; j++) {
				if (student[i][4] < student[j][4]) {
					int[] tmp = student[i];
					student[i] = student[j];
					student[j] = tmp;
				}
			}
		}
	}
	
	static void print(int[][] student, int cnt, String str) {
		System.out.println(str);
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.printf("%d\t", student[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int student[][] = new int[10][6];
		/* 학생정보를 입력받아 총점, 석차를 구하여 출력하는 프로그램 작성
		 * 학생정보는 번호 국어 영어 수학으로 구성
		 * [입력자료]
		 * 학생정보 : 1 90 88 75
		 * 학생정보 : 2 95 80 90
		 * 학생정보 : 3 79 85 70
		 * 			.
		 * 			.
		 * 			.
		 * 학생정보 : 0
		 * 
		 * [출력형식 1]
		 * 번호   국어   영어   수학   총점   순위
		 *  1    90    88   75
		 *  2    95    80   90
		 *  		.
		 *  		.
		 *  [출력 2]
		 *  총점 내림자순
		 * */
		
		// 입력
		int cnt = input(student);
		
		// 출력
		grade(student, cnt);
		print(student, cnt, "[출력형식 1]");
		System.out.println();
		
		sort(student, cnt);
		print(student, cnt, "[출력형식 2]");
	}

}
