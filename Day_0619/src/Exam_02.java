
public class Exam_02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		
		System.out.println("문자열 : " + sb);
		System.out.println("문자열 : " + sb.toString());
		
		sb.append(" Servlet"); // 맨 뒤에 문자열 추가
		System.out.println("문자열 : " + sb);
		
		sb.insert(5, "JSL "); // 원하는 위치에 문자열 삽입
		System.out.println("문자열 : " + sb);
		
		char ch = sb.charAt(0);
		System.out.println("0번째 문자 : " + ch);
		
		sb.delete(0, 4); // 0부터 4 전까지 삭제
		System.out.println("문자열 : " + sb);
		
		sb.deleteCharAt(7); // 7번째 삭제
		System.out.println("문자열 : " + sb);
		
		sb.setCharAt(8, 'A'); // 8번 'A'로 변경
		
		sb.replace(0, 3, "KOR"); // 0부터 3 전까지 "KOR"로 번경
		
		sb.reverse(); // 문자열 뒤집기
	}

}
