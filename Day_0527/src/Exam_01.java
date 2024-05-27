
public class Exam_01 {

	public static void main(String[] args) {
		// 난수(0 ~ 1 사이 무작위 수) 만들기
		double r = Math.random();
		System.out.println(r);
		
		// 1 ~ n 사이 난수
		// (int) (Math.random() * n) + start;
		int n = (int)(Math.random() * 6) + 1;
		
		System.out.println(n);
	}

}
