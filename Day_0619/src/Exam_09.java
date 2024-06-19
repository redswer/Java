import java.io.*;
import java.util.*;

public class Exam_09 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in); //=> 키보드 입력
		Scanner scf = new Scanner(new File("data.txt")); //=> 파일 입력
		
		while(scf.hasNextLine()) {
			String str = scf.nextLine();
			
			System.out.println(str);
			
			
		}
		
		System.out.println("-------------------------");
		
		Scanner scf2 = new Scanner(new File("src/name.txt"));
		while(scf2.hasNext()) {
			String str = scf2.next();
			System.out.println(str);
		}
	}
	

}
