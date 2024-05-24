
public class Exam_02 {
	static void function(int num) {
		if (num == 0) {
			return;
		}
		
		System.out.println("Hello World");
		
		function(num - 1);
	}

	public static void main(String[] args) {
		function(5);
	}

}
