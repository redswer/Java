import java.util.Arrays;
import java.util.Random;

public class Exam_08 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int lotto[] = new int[6];
		int cnt = 0;
		
		while(cnt < 6) {
			int k = r.nextInt(45) + 1;
			boolean bool = true;
			
			for (int i = 0; i < cnt; i++) {
				if (k == lotto[i]) {
					bool = false;
					break;
				}
			}
			
			if (!bool)
				continue;
			
			lotto[cnt] = k;
			cnt++;
		}
		
		System.out.println(Arrays.toString(lotto));
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

}
