
public class Exam_04 {
	// 1 ~ 10 까지의 정수 출력하는 메서드
	static void count() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		count();
		System.out.println("\n---------------------------");
		System.out.println(sum());
		
		int sum = sum();
		System.out.println(sum);
	}
	
	// 1 ~ 10 까지의 정수의 합을 구하여 반환하는 메서드
	static int sum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
		// => 반환타입이 int 인 메서드이므로 int 타입의 return 이 반드시 필요함
	}
}
