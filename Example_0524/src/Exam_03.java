
public class Exam_03 {

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int num = 1;
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				a[i][j] = num;
				num++;
				
				a[i][4] += a[i][j];
				a[4][j] += a[i][j];
				a[4][4] += a[i][j];
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
	}

}
