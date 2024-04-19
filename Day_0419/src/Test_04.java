
public class Test_04 {

	public static void main(String[] args) {
		// 1년 (365.2422일)을 일, 시, 분, 초로 표현하기
		
		double year = 365.2422;
		
		int day = (int) year;
		int sec = (int) (24 * 60 * 60 * (year - day));
		
		int min = sec / 60;
		sec = sec % 60;
		
		int hour = min / 60;
		min = min % 60;
		
		
		System.out.println(day + "일");
		System.out.println(hour + "시");
		System.out.println(min + "분");
		System.out.println(sec + "초");
	}

}
