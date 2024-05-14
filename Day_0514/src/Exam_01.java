
public class Exam_01 {

	public static void main(String[] args) {
		int score[] = {80, 90, 70, 85, 77};
		
		for (int i = 0; i < score.length; i++) {
			int r = 1;
			
			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) {
					r++;
				}
			}
			
			System.out.println(score[i] + "의 석차 : " + r);
		}
	}

}
