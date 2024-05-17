
public class Exam_05 {

	public static void main(String[] args) {
		int score[][] = {{5, 90, 88, 78, 0}, {2, 90, 85, 80, 0}, {1, 80 , 70, 90, 0}, {3, 95, 90, 85, 0}, {4, 88, 78, 90, 0}};
		// 전체 출력
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i][0] + "\t");
			
			for (int j = 1; j < score[i].length - 1; j++) {
				score[i][4] += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(score[i][4]);
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		// 번호 기준 오름차순 정렬
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i][0] > score[j][0]) {
					int tmp[] = score[j];
					score[j] = score[i];
					score[i] = tmp;
				}
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i][0] + "\t");
			
			for (int j = 1; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			
			System.out.println();
		}
	}

}
