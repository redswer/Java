package exam;

import java.util.List;

import model.MemberDAO;
import model.MemberDTO;

public class Exam_02 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		List<MemberDTO> list = dao.memberList();
		
		System.out.println("회원번호\t고객성명\t전화번호\t\t성별\t생년월일\t가입일자");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getUserno() + "\t");
			System.out.print(list.get(i).getName() + "\t");
			System.out.print(list.get(i).getPhone1() + "-");
			System.out.print(list.get(i).getPhone2() + "-");
			System.out.print(list.get(i).getPhone3() + "\t");
			
			if(list.get(i).getGender().equals("M")) {
				System.out.print("남자\t");
			} else {
				System.out.print("여자\t");
			}
			
			System.out.print(list.get(i).getBirthday() + "\t");
			
			String regdate = list.get(i).getRegdate();
			System.out.print(regdate.substring(0, 4) + "년");
			System.out.print(regdate.substring(4, 6) + "월");
			System.out.print(regdate.substring(6, 8) + "일\n");
		}
	}

}
