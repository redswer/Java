
public class Exam_04 {

	public static void main(String[] args) {
		int score[][] = {{5, 90, 88, 78}, {2, 90, 85, 80}, {1, 80 , 70, 90}, {3, 95, 90, 85}, {4, 88, 78, 90}};
		int sum = 0;
		// 전체 출력
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i][0] + "\t");
			sum = 0;
			
			for (int j = 1; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			
			System.out.print(sum);
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		
		// 국어점수가 가장 높은 학생 찾아서 데이터 출력
		int max[] = score[0];
		sum = 0;
		
		for (int i = 0; i < max.length; i++) {
			if (max[1] < score[i][1]) {
				max = score[i];
			}
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점");
		for (int i = 0; i < max.length; i++) {
			System.out.print(max[i] + "\t");
			sum += max[i];
		}
		
		sum = sum - max[0];
		System.out.print(sum);
	}

}
