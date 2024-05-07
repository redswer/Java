
public class Exam_10 {

	public static void main(String[] args) {
		/* int val[] = {87, 90, 67, 59, 88, 76, 95, 78}
		 * 평균에 가장 가까운 점수 찾기
		 * 단, 평균은 소수 첫번째 자리에서 반올림하여 정수로 표현함
		 * 
		 * [출력예시]
		 * Data : 87 90 67 59 88 76 95 78
		 * 평균 : 80
		 * 평균에 가장 가까운 점수 : 78
		 * */
		
		int val[] = {87, 90, 67, 59, 88, 76, 95, 78}; 
		int sum = 0;
		
		for(int i : val) {
			sum += i;
		}
		
		int avg = sum / 8;
		int c = 100;
		int s = val[0];
		
		System.out.print("Data :");
		for(int i : val) {
			if ((avg - i) > 0) {
				if (c > (avg - i)) {
					c = avg - i;
					s = i;
				}
			} else if((avg - i) < 0) {
				if(c > (i - avg)) {
					c = i - avg;
					s = i;
				}
			}
			System.out.printf("%3d", i);
		}
		
		System.out.println();
		System.out.println("평균 : " + avg);
		System.out.println("평균에 가장 가까운 값 : " + s);
	}

}
