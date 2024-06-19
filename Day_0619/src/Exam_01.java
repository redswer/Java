
public class Exam_01 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(); // default 생성자 (크기 : 16)
		StringBuffer sb2 = new StringBuffer(30); // 크기 지정
		StringBuffer sb3 = new StringBuffer("Korea"); // 기본 생성자에 "Korea" 를 저장하고 그 크기만큼 증가 (크기가 21이 됨)
		
		//=> 물리적인 크기 : capacity()
		int size = sb1.capacity(); 
		System.out.println("sb1 : " + size);
		System.out.println("sb2 : " + sb2.capacity());
		System.out.println("sb3 : " + sb3.capacity());
		
		System.out.println("-------------------------");
		
		// 문자열 갯수 : length()
		System.out.println("sb1 : " + sb1.length());
		System.out.println("sb2 : " + sb2.length());
		System.out.println("sb3 : " + sb3.length());
	}

}
