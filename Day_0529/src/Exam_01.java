
public class Exam_01 {

	public static void main(String[] args) {
		// 계산기 만들기 (+, -, *, /, %)
		// 산술연산자 외에 입력되는 연산자는 입력오류
		
		Calculator cal = new Calculator();
		
		cal.add(7, 5);
		cal.add(7, 4.5);
		cal.add(5.9, 6);
		cal.add(7.0, 5.8);
	}

}
