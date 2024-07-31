package exam;

import java.util.List;
import java.util.Scanner;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_01 {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		StudentDTO dto = new StudentDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생등록 화면");
		
		System.out.print("학년 : ");
		dto.setSyear(sc.nextLine());
		
		System.out.print("반 : ");
		dto.setSclass(sc.nextLine());
		
		System.out.print("번호 : ");
		dto.setSno(sc.nextLine());
		
		System.out.print("이름 : ");
		dto.setSname(sc.nextLine());
		
		System.out.print("생년월일 : ");
		dto.setBirth(sc.nextLine());
		
		System.out.print("성별(M//F) : ");
		dto.setGender(sc.nextLine());
		
		System.out.print("전화번호 : ");
		dto.setTel1(sc.next());
		dto.setTel2(sc.next());
		dto.setTel3(sc.next());
		
		dao.insertStudent(dto);
		
		List<StudentDTO> list = dao.printAllStudent();
		
		System.out.println("학년\t반\t번호\t이름\t생년월일\t\t성별\t전화1\t전화2\t전화3");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSyear() + "\t");
			System.out.print(list.get(i).getSclass() + "\t");
			System.out.print(list.get(i).getSno() + "\t");
			System.out.print(list.get(i).getSname() + "\t");
			System.out.print(list.get(i).getBirth() + "\t");
			System.out.print(list.get(i).getGender() + "\t");
			System.out.print(list.get(i).getTel1() + "\t");
			System.out.print(list.get(i).getTel2() + "\t");
			System.out.print(list.get(i).getTel3() + "\n");
		}
	}

}
