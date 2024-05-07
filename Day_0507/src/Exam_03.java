
public class Exam_03 {

	public static void main(String[] args) {
		int score[] = {70, 50, 90, 70, 60, 70, 80, 90}; // 선언과 동시에 초기화
		
		System.out.print("점수 : \t");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%d\t", score[i]);
		}
		
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double) sum / score.length;
		
		System.out.println("\n총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
