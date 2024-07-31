package exam;

import java.util.List;
import java.util.Scanner;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_02 {

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
		
		System.out.print("국어 : ");
		dto.setKor(Integer.parseInt(sc.nextLine()));
		
		System.out.print("영어 : ");
		dto.setEng(Integer.parseInt(sc.nextLine()));
		
		System.out.print("수학 : ");
		dto.setMat(Integer.parseInt(sc.nextLine()));
		
		dao.insertScore(dto);
		
		List<StudentDTO> list = dao.printAllScore();
		
		System.out.println("학년\t반\t번호\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSyear() + "\t");
			System.out.print(list.get(i).getSclass() + "\t");
			System.out.print(list.get(i).getSno() + "\t");
			System.out.print(list.get(i).getKor() + "\t");
			System.out.print(list.get(i).getEng() + "\t");
			System.out.print(list.get(i).getMat() + "\t");
			System.out.print(list.get(i).getTot() + "\t");
			System.out.printf("%.1f\n", list.get(i).getAvg());
		}
	}

}
