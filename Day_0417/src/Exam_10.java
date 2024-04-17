
public class Exam_10 {

	public static void main(String[] args) {
		int a = 2;
		int b = a << 3;
		System.out.println(a + " << 3 = " + b);
		
		a = 32;
		b = a >> 3; // => a / 2의 3승
		System.out.println(a + " >> 3 = " + b);
		
		a = -128;
		b = a >> 1;
		System.out.println(a + " >> 1 = " + b);
		
		b = a >>> 1; // => 3개를 쓰면 양수로 바뀜
		System.out.println(a + " >>> 1 = " + b);		
	}

}
