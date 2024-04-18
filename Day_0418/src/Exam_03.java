
public class Exam_03 {

	public static void main(String[] args) {
		int a = 7, b = 5;
		
		int res = ~a;
		System.out.println(res);
		
		res = a & b; // => 2진수로 바꿔서 둘 다 1이면 1, 아니면 0
		/*	| 7 = 111
		 *  | 5 = 101
		 * &|___________
		 *        101  => 5
		 * */
		System.out.println(res);
		
		res = a | b; // => 둘 중 하나만 1이어도 1
		/*	| 7 = 111
		 *  | 5 = 101
		 * ||___________
		 *        111  => 7
		 * */
		System.out.println(res);
		
		res = a ^ b; // => 둘 중 하나만 1이어야 1
		/*	| 7 = 111
		 *  | 5 = 101
		 * ^|___________
		 *        010  => 2
		 * */
		System.out.println(res);
		
	}

}
