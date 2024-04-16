
public class Exam_08 {

	public static void main(String[] args) {
		// 자동 형변환 int < double
		int a = 77;
		double b = a;
		
		// 강제 형변환(데이터 타입)
		double c = 3.14;
		int d = (int) c;
		
//		-----------------------------------
		double avg = 87.54678;
		
		// 1. 버림
		int avg1 = (int) avg; // 87
		
		// 2. 소수 첫째자리에서 반올림
		int avg2 = (int) (avg + 0.5); // 88
		
		// 3. 소수 둘째자리에서 반올림
		double avg3 = (int) (avg * 10 +0.5) / 10.0; // 87.5
		
		// 4. 소수 셋째자리에서 반올림
		double avg4 = (int) (avg * 100 + 0.5) / 100.0; // 87.55
		
		System.out.println(avg);
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println(avg4);
	}

}
