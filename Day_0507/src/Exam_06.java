
public class Exam_06 {

	public static void main(String[] args) {
		// 87, 90, 67, 59, 88, 76, 95, 78
		// 평균, 평균이상 자료, 건수 출력
		/* [출력예시]
		 * Data : 87 90 67 59 88 76 95 78
		 * 평균 : 80
		 * 평균이상 : 87 90 88 95
		 * 평균이싱 학생 수 : 4명
		 * */
		
		int val[] = {87, 90, 67, 59, 88, 76, 95, 78};
		
		int sum = 0;
		System.out.print("Data :");
		for (int i : val) {
			System.out.printf("%3d", i);
			sum += i;
		}
		
		System.out.println();
		double avg = sum / 8.0;
		System.out.println("평균 : " + avg);
		
		int cnt = 0;
		System.out.print("평균이상 :");
		for(int i : val) {
			if(i >= avg) {
				System.out.printf("%3d", i);
				cnt++;
			}
		}
		
		System.out.println();
		System.out.println("평균이상 학생 수 : " + cnt + "명");
	}

}
