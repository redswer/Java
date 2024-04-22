
public class Exam_12 {

	public static void main(String[] args) {
		// 점수가 90 이상, 80 이상, 70 이상, 60 이상, 60미만
		
		int score = 87;
		String grade = "F";
		
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		}
	}

}
