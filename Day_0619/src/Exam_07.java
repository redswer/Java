import java.util.Random;

public class Exam_07 {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt());
		System.out.println(r.nextDouble());
		
		// 1 ~ n 까지의 정수
		System.out.println(r.nextInt(45)); // => 0 ~ 44 까지의 난수
		System.out.println(r.nextInt(45) + 1);
	}

}
