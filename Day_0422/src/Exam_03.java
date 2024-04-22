import java.io.IOException;
import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) throws IOException {
		// 키보드로 대문자(영문) 입력 체크
		
		Scanner sc = new Scanner(System.in);
				
//		System.out.print("영문자 입력 : ");
//		char ch = sc.nextLine();
		// => char 타입은 Scanner로 입력받을 수 없음
		
		System.out.println("1문자 입력 : ");
		char ch = (char) System.in.read();
		// => System.in.read() => 1문자를 입력 정수로 변환
		// => Exception 처리 필요
		
		String s = "";
		
		if (ch < 65 || ch > 96) {
			s = "소문자";
		} else {
			s = "대문자";
		}
		
		System.out.println(s);
	}

}
