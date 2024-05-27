
public class Exam_08 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add(7, 4);
		cal.min(7, 4);
		cal.mul(7, 4);
		cal.div(7, 4);
		cal.div(7, 0); // => 오류 처리 (0 으로 나눌 수 없음)
		cal.na(7, 4);
		cal.sum(1, 2, 3, 4, 5);
		cal.sum(4, 7, 5);
	}

}
