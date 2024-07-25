package exam;

import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Exam_03 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("회원번호 : ");
		MemberDTO dto = dao.selectMember(Integer.parseInt(sc.nextLine()));
		
		if (dto.getName() == null) {
			System.out.println("등록된 회원이 아닙니다.");
		} else {
			System.out.println("회원성명 : " + dto.getName());
			System.out.println("연락처 : " + dto.getPhone1() + "-" + dto.getPhone2() + "-" + dto.getPhone3());
			System.out.println("성별 : " + dto.getGender());
			System.out.println("생년월일 : " + dto.getBirthday());
			System.out.println("가입날짜 : " + dto.getRegdate());
		}
	}

}
