import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		// 문자열 비교
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String s = sc.nextLine();
		
		System.out.println("입력된 문자열 : " + s);
		
		if (s == "Korea") {
			System.out.println("OK");
		} else {
			System.out.println("NO");				
		}
		
		if (s.equals("Korea")) {
			// => equals : 대소문자 구분해서 비교
			// => equalsIgnoreCase : 대소문자 구분 없이 비교
			System.out.println("OK");
		}
	}

}
