
public class Exam_07 {

	public static void main(String[] args) {
		int a = 7;
		boolean bool = a % 2 == 1;
		System.out.println("bool : " + bool);
		
		String result = bool ? "홀수" : "짝수";
		System.out.println(result);
		
		result = a % 2 ==1 ? "홀수" : "짝수";
		System.out.println(result);		
	}

}
