
public class Exam_04 {

	public static void main(String[] args) {
		int size = 5;
		int[][] a = new int[size][size];
		int num = 1;
		
		int rowStart = 0;
		int rowEnd = size - 1;
		int colStart = 0;
		int colEnd = size - 1;
		
		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int i = colStart; i <= colEnd; i++) {
				a[rowStart][i] = num++;
			}
			rowStart++;
			
			for (int i = rowStart; i <= rowEnd; i++) {
				a[i][colEnd] = num++;
			}
			colEnd--;
			
			if (rowStart <= rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					a[rowEnd][i] = num++;
				}
				rowEnd--;
			}
			
			if (colStart <= colEnd) {
				for (int i = rowEnd; i >= rowStart; i--) {
					a[i][colStart] = num++;
				}
				colStart++;
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf("%3d", a[i][j]);				
			}
			System.out.println();
		}
	}

}
