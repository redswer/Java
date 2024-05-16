
public class Exam_05 {

	public static void main(String[] args) {
		// 5 * 5 행열
		// 1 ~ 25까지 행열에 넣고 출력
		
		int arr[][] = new int[5][5];
		
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt;
				cnt++;
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
