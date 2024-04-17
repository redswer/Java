
public class Exam_08 {

	public static void main(String[] args) {
		// 반올림
		double avg = 87.5678;
//		--------------------------------------------
		// 수동 반올림
		
		double a1 = (int) (avg * 100 + 0.5) / 100.0;
		System.out.println(avg + " --> " + a1);
		
//		-----------------------------------------------------------
		// 자동 반올림
		
		System.out.printf("%.4f --> %.2f\n", avg, avg);
		// => printf 활용 (변수에 저장 x)
		
		String a2 = String.format("%.2f", avg);
		
		System.out.println(avg + " --> " + a2);
		// => String 클래스의 format 함수 활용 (String 타입으로 저장됨 -> 연산 시 불편함)
	}

}
