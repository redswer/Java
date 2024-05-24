
public class Exam_05 {
	static int func(int num) {
		if (num == 1) {
			return 1;
		}
		
		int t = num * func(num - 1);
		System.out.println(t);
		return t;
	}
	public static void main(String[] args) {
		System.out.println(func(5));
		// => 5! = 5 * 4 * 3 * 2 * 1
	}

}
