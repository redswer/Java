
public class Exam_02 {

	public static void main(String[] args) {
		int sw = 3;
		
		switch (sw) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
//			break;
			// => break; 가 없으면 밑의 조건들이 무시되고 출력 => 3, 4, Error 모두 출력됨
		case 4:
			System.out.println("4");
		default:
			System.out.println("Error");
		}
	}

}
