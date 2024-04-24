package forWhile;

public class Ex11 {

	public static void main(String[] args) {
		int i = 0, s = 0, sw = 0;
		
		do {
			i++;
			if (sw == 0) {
				s += i;
				sw++;
			} else {
				sw = 0;
				s -= i;
			}
		} while(i != 10);
		
		System.out.println(s);
	}

}
