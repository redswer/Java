
public class Exam_04 {

	public static void main(String[] args) {
		boolean bool = false;
		
		System.out.println("bool : " + bool);
		System.out.println("bool : " + !bool);
		
		System.out.println("3 < 5 : " + (3 < 5));
		System.out.println("!(3 < 5) : " + !(3 < 5));
		
		System.out.println("3 < 5 && 2 >= 5 : " + (3 < 5 && 2 >= 5));
		System.out.println("3 < 5 || 2 >= 5 : " + (3 < 5 || 2 >= 5));
		System.out.println("3 < 5 && 2 >= 5 : " + (3 < 5 & 2 >= 5));
		System.out.println("3 < 5 || 2 >= 5 : " + (3 < 5 | 2 >= 5));
		// => &(비트 and) 와 &&(논리 and) 의 차이는 & 는 첫 번째 조건이 false 라도 두 번째 조건까지 계산하지만,
		//	  && 는 첫 번째 조건이 false 면 바로 false 를 반환하므로 연산 속도가 더 빠름 
	}

}
