class AA {
	void sum(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		System.out.printf("1 ~ %d 합 : %d\n", n, s);
	}
	
	int add(int a, int b) {
		int s = 0;
		for (int i = a; i <= b; i++) {
			s += i;
		}
		
		return s;
	}
}
public class Exam_06 {

	public static void main(String[] args) {
		AA a = new AA();
		
		a.sum(50);
		System.out.println(a.add(1, 50));
	}

}
