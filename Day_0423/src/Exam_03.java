
public class Exam_03 {

	public static void main(String[] args) {
		double avg = 79.45;
		
		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");			
		}
		
		switch ((int) avg / 10) { // => 정수만 가능(실수는 불가능)
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}

}
