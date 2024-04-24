package forWhile;

public class Ex09 {

	public static void main(String[] args) {
		// 1 ~ 10 까지의 합계
		
		int i = 0, s = 0;
		
		do {
			i++;
			s += i;
		} while(i != 10);
		
		System.out.println(s);
		
		System.out.println("-------------------------");
		
		int cnt = 0, sum = 0;
		
		while(cnt < 10) {
			cnt++;
			sum += cnt;
		}
		
		System.out.println(sum);
	}

}
