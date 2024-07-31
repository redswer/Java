package exam;

import java.util.Scanner;

import model.StudentDAO;

public class Exam_03 {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생정보 삭제");
		
		System.out.print("학번입력 : ");
		String bun = sc.nextLine();
		
		if(dao.deleteStudent(bun) == 0) {
			System.out.println(bun + " 학생성적정보가 존재하지 않습니다.");
		} else {
			System.out.println(bun + " 학생정보가 삭제되었습니다.");
		}
	}
}
