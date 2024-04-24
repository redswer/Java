package forWhile;

public class Ex12 {

	public static void main(String[] args) {
		int i = 0, j = 1, k = 1;
		
		do {
			i++;
			j += i;
			k += j;
		} while (j != 22);
		
		System.out.println(k);
	}

}
