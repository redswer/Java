
public class Exam_02 {

	public static void main(String[] args) {
		/*
		 * 1	2	3	4	10
		 * 5	6	7	8	26
		 * 9	10	11	12	42
		 * 13	14	15	16	58
		 * 17	18	19	20	74
		 * */
		int cnt = 1;
		
		for (int i = 1; i <= 5; i++) {
			int sum = 0;
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%d\t", cnt);
				sum += cnt;
				cnt++;
			}
			System.out.print(sum);
			System.out.println();
		}
	}

}
