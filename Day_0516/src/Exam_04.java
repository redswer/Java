
public class Exam_04 {

	public static void main(String[] args) {
		// 2차원 배열 student 안의 각 배열의 데이터가 번호, 국어점수, 영어점수, 수학점수
		int student[][] = {{1, 90, 88, 79}, {2, 95, 88, 79}, {3, 68, 80, 70}, {4, 79, 67, 95}, {5, 85, 80, 70}};

		System.out.println("번호\t국어\t영어\t수학");
		for (int i[] : student) {
			for (int j : i) {
				System.out.printf("%d\t", j);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------");
		
		// 전체 데이터 + 총점, 평균 출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < student.length; i++) {
			int sum = 0;
			double avg = 0;
			
			for (int j = 0; j < student[i].length; j++) {
				if (j != 0) {
					sum += student[i][j];
				}
				
				System.out.printf("%d\t", student[i][j]);
			}
			
			avg = sum / (double)(student[i].length - 1);
			
			System.out.printf("%d\t%.2f", sum, avg);
			System.out.println();
		}
	}

}
