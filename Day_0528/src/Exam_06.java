
public class Exam_06 {

	public static void main(String[] args) {
		int bun = 1101;
		String name = "김학생";
		int[] score = {90, 66, 89, 78, 66};
		
		Score s1 = new Score(bun, name, score);
		
		s1.totAvg();
		s1.printWithGrade();
		
		int max = s1.max();
		int min = s1.min();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		bun = 1102;
		name = "이학생";
		int[] score2 = {77, 58, 95, 90, 66, 89, 78, 66};
		
		Score s2 = new Score(bun, name, score2);
		
		s2.totAvg();
		s2.printWithoutGrade();
		
		max = s2.max();
		min = s2.min();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
