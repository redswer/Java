
public class Exam_07 {
	static void swap(int a[]) {
		int tmp = a[0];
		a[0] = a[1];
		a[1] = tmp;
	}

	public static void main(String[] args) {
		int a[] = {10, 20};		
		System.out.printf("a = %d, b = %d\n", a[0], a[1]);
		
		swap(a);
		System.out.printf("a = %d, b = %d\n", a[0], a[1]);
		// => 참조에 의한 호출
		// => 배열은 0번째 값의 주소를 참조하므로 메서드에서 배열의 값이 바뀌면 바뀐 값이 저장됨
	}

}
