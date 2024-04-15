
public class Exam_06 {

	public static void main(String[] args) {
		// 일정한 간격 띄우기 (\t)
		
		System.out.println("이름   국어   영어   수학");
		System.out.println("김학생" + "   " + 90 + "   " + 80 + "   " + 80);
		
		System.out.println("--------------------------------");
		
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("김학생" + "\t" + 90 + "\t" + 80 + "\t" + 80);
		
		System.out.println("--------------------------------");
		
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("김학생aaaaaaaa" + "\t" + 90 + "\t" + 80 + "\t" + 80);
		// => 글자가 길어지면 뒤로 밀림에 주의
	}

}
