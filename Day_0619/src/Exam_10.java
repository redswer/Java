import java.util.StringTokenizer;

public class Exam_10 {

	public static void main(String[] args) {
		String name = "김학생,이학생,강학생,유학생";
		
		StringTokenizer st = new StringTokenizer(name, ",");
		
		while(st.hasMoreTokens()) {
			String n = st.nextToken();
			System.out.println(n);
		}
		
		System.out.println("-----------------------------");
		
		String name2 = "김학생 이학생, 강학생 유학생, 박학생";
		StringTokenizer st2 = new StringTokenizer(name2, ", ");
		
		while(st2.hasMoreTokens()) {
			String n = st2.nextToken();
			System.out.println(n);
		}
		
		// => 구분자가 하나일 경우에는 split , 둘 이상일 경우에는 StringTokenzier 가 편함
	}

}
