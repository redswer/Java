
public class Exam_02 {

	public static void main(String[] args) {
		int score[] = {80, 90, 70, 85, 77};
		int rank[] = new int[5];
		
		for (int i = 0; i < score.length; i++) {
			int r = 1;
			
			for (int j = 0; j < score.length; j++) {
				if (score[i] < score[j]) {
					r++;
				}
			}
			
			rank[i] = r;
			
			System.out.println(score[i] + "의 석차 : " + rank[i]);
		}
	}

}
