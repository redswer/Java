
public class Exam_01 {

	public static void main(String[] args) {
		int arr[]; // 배열변수 선언
		arr = new int[5]; // 메모리 공간 할당
		
		int a[] = new int[5]; // 선언과 동시에 랄당
		
		
		arr[0] = 100;
		System.out.println(arr); // 참조값(주소)
		System.out.println(arr[0]);
		System.out.println(arr.length); // 배열의 길이
		
		
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
//		arr[5] = 600; // 런타임 에러 (실행 시 에러)
		
		int n = 100;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n;
			n += 100;
			System.out.println(arr[i]);
		}
	}

}
