import java.io.File;
import java.util.*;

public class Exam_11 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("data.txt"));
		
		StringTokenizer st = null;
		System.out.println("번호\t이름\t국어\t영어\t수학");
		
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			
			st = new StringTokenizer(str, ", ");
			
			String bun = st.nextToken();
			String name = st.nextToken();
			String kor = st.nextToken();
			String eng = st.nextToken();
			String math = st.nextToken();
			
			System.out.printf("%s\t%s\t%s\t%s\t%s\n", bun, name, kor, eng, math);
		}
	}

}
