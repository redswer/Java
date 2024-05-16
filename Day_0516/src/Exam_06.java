
public class Exam_06 {

	public static void main(String[] args) {
		// 5 * 5 행열
		/* 1  6  11  16  21
		 * 2  7  12  17  22
		 * 3  8  13  18  23
		 * 4  9  14  19  24
		 * 5 10  15  20  25
		 * */
		
		int arr[][] = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0) {
					arr[i][j] = i + 1;
				} else {
					arr[i][j] = arr[i][j - 1] + 5;
				}
			}
		}
		
		for (int i[] : arr) {
			for (int j : i) {
				System.out.printf("%3d", j);
			}
			
			System.out.println();
		}
	}

}
