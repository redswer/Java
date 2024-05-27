import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		// 회원가입 (이름. 아이디, 비밀번호)
		Login l = new Login();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원가입 : ");
		String name = sc.next();
		String id = sc.next();
		String password = sc.next();
		
		boolean f = l.join(name, id, password);
		
		if (!f) {
			System.out.println("회원가입 실패");
		} else {			
			System.out.println("회원가입 성공");
		}
		
		// 로그인 (아이디, 비밀번호)
		System.out.print("로그인 : ");
		String j_id = sc.next();
		String j_password = sc.next();
		
		if (l.login(j_id, j_password)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");			
		}
		
		// 로그아웃
		l.logout();
	}

}
