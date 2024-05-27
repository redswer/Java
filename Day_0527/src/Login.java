
public class Login {
	// 속성 (멤버변수) : 인스턴스 변수
	String name;
	String id;
	String password;
	
	boolean join(String n, String i, String p) {
		if (n.equals("") || i.equals("") || p.equals("")) {
			return false;
		}
		
		name = n;
		id = i;
		password = p;
		
		return true;
	}
	
	boolean login(String i, String p) {
		if (id.equals(i) && password.equals(p)) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout() {
		id = "";
		name = "";
		password = "";
		System.out.println("로그아웃");
	}
}
