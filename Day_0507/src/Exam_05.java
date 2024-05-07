import java.util.Arrays;

public class Exam_05 {

	public static void main(String[] args) {
		char ch[] = {'A', 66, 'C', 68, 'E', 'F'};
		String str[] = {"김사원", "이사원", "강사원", "오사원", "윤사원"};
		
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(str));
	
		for(char c : ch) {
			System.out.printf("%3s", c);
		}
		
		System.out.println();
		
		for(String s : str) {
			System.out.printf("%4s", s);
		}
	}

}
