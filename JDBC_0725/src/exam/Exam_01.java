package exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;

public class Exam_01 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		System.out.println("회원번호 : " + (dao.userno() + 1));
		dto.setUserno(dao.userno() + 1);
		
		System.out.print("회원성명 : ");
		dto.setName(sc.nextLine());
		
		System.out.print("연락처 : ");
		String p = sc.nextLine();
		dto.setPhone1(p.substring(0, 3));
		if(p.length() == 13) {
			dto.setPhone2(p.substring(4, 8));
			dto.setPhone3(p.substring(9, 13));
		} else {
			dto.setPhone2(p.substring(3, 7));
			dto.setPhone3(p.substring(7, 11));
		}
		
		String gender = "";
		while(true) {
			System.out.print("성별 : ");
			gender = sc.nextLine().toUpperCase();
			
			if (gender.equals("M") || gender.equals("F")) {
				break;
			}
			System.out.println("M 또는 F 만 입력");
		}
		dto.setGender(gender);
		
		System.out.print("생년월일 예)010101 : ");
		dto.setBirthday(sc.nextLine());
		
		String nowdate = sdf.format(date);
		System.out.print("가입일자 : ");
		String regdate = sc.nextLine();
		if(regdate.equals("") || regdate == null) {
			regdate = nowdate;
		}
		dto.setRegdate(regdate);
		
		int result = dao.insert(dto);
		if (result == 1) {
			System.out.println("등록성공");
		} else {
			System.out.println("등록실패");
		}
	}
}
