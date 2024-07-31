package exam;

import java.util.List;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_05 {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		List<StudentDTO> list = dao.printStatics();
		
		System.out.println("학년\t반\t교사명\t국어총점\t영어총점\t수학총점\t국어평균\t영어평균\t수학평균");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSyear() + "\t");
			System.out.print(list.get(i).getSclass() + "\t");
			System.out.print(list.get(i).getTname() + "\t");
			System.out.print(list.get(i).getClass_k_tot() + "\t");
			System.out.print(list.get(i).getClass_e_tot() + "\t");
			System.out.print(list.get(i).getClass_m_tot() + "\t");
			System.out.printf("%.1f\t", list.get(i).getClass_k_avg());
			System.out.printf("%.1f\t", list.get(i).getClass_e_avg());
			System.out.printf("%.1f\n", list.get(i).getClass_m_avg());
		}
	}

}
