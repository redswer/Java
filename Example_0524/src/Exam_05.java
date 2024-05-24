
public class Exam_05 {

	public static void main(String[] args) {
		int[][] values = {{5, 90, 88, 78, 0, 0},
						{2, 90, 85, 80, 0, 0},
						{1, 80, 70, 90, 0, 0},
						{3, 95, 90, 85, 0, 0},
						{4, 88, 78, 90, 0, 0}};
	
		for (int i = 0; i < values.length; i++) {
			for (int j = 1; j < 4; j++) {
				values[i][4] += values[i][j];
			}
		}
		
		for (int i = 0; i < values.length; i++) {
			int r = 1;
			for (int j = 0; j < values.length; j++) {
				if (values[i][4] < values[j][4]) {
					r++;
				}
				
				values[i][5] = r;
			}
		}
		
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i][0] > values[j][0]) {
					int tmp[] = values[i];
					values[i] = values[j];
					values[j] = tmp;
				}
			}
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				System.out.printf("%d\t", values[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("총점이 가장 높은 학생 : ");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++) {
				if (values[i][4] == 1) {
					System.out.printf("%d\t", values[i][j]);
				}
			}
		}
		System.out.println();
		System.out.print("총점이 가장 낮은 학생 : ");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++) {
				if (values[i][5] == 5) {
					System.out.printf("%d\t", values[i][j]);
				}
			}
		}
	}

}
