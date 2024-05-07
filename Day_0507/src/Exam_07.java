
public class Exam_07 {

	public static void main(String[] args) {
		// score = {30, 67, 55, 79, 97, 65, 33, 78, 96, 58, 94, 32}
		// 최소값, 최대값을 뺀 나머지 합계 출력
		/* [출력형식]
		 * Data : 30 67 55 79 97 65 33 48 96 58 94 32
		 * 최대 : 97
		 * 최소 : 30
		 * 합계 : 657
		 * */
		
		int score[] = {30, 67, 55, 79, 97, 65, 33, 78, 96, 58, 94, 32};
		
		int max = score[0];
		int min = score[0];
		int sum = 0;
		
		System.out.print("Data :");
		for(int i : score) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
			
			sum += i;
			
			System.out.printf("%3d", i);
		}
		
		System.out.println();
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println("합계 : " + (sum - max - min));
	}

}
