
public class Exam_02 {

	public static void main(String[] args) {
		int bun = 1101;
		String name = "김학생";
		int kr = 94;
		int en = 88;
		int math = 90;
		
		int sum = kr + en + math;
		
		double avg = sum / 3.0;
		//	double avg = sum / 3;
		// => 정수와 정수의 연산 = 정수
		// => 따라서 실수의 값을 가지려면 실수와 정수의 연산 필요
		
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);		
	}

}
