
public class Exam_03 {

	public static void main(String[] args) {
		/* 1	2	 3	 4	 5
		 * 		6	 7	 8	 9
		 * 			10	11	12
		 * 				13	14
		 * 					15
		 * */
		int cnt = 1;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= 2 * i - i; j++) {
				System.out.printf("\t");
			}
			for (int j = 2; j <= 6 - i; j++) {
				System.out.printf("%d\t", cnt);
				cnt++;
			}
			System.out.println();
		}
	}

}
