
public class Exam_04 {
	static int sum(int num) {
		if (num == 1) {
			return 1;			
		}
		
		return num + sum(num - 1);
	}

	public static void main(String[] args) {
		int sum = sum(5);
		
		System.out.println("1~5 합 : " + sum);
	}

}
