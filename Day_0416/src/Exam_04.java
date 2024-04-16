import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int intVal = Integer.parseInt(sc.nextLine());
		
		System.out.println("입력된 값은 " + intVal);
	}
}