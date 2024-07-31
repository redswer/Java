package exam;

import java.util.List;

import model.StudentDAO;
import model.StudentDTO;

public class Exam_04 {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		List<StudentDTO> list = dao.printAllStudentScore();
		
		int count = 0;
		int kor_tot = 0;
		int eng_tot = 0;
		int mat_tot = 0;
		
		System.out.println("학년-반-번호\t이름\t성별\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSyear() + "-" + list.get(i).getSclass() + "-" + list.get(i).getSno() + "\t\t");
			System.out.print(list.get(i).getSname() + "\t");
			System.out.print(list.get(i).getGender() + "\t");
			System.out.print(list.get(i).getKor() + "\t");
			System.out.print(list.get(i).getEng() + "\t");
			System.out.print(list.get(i).getMat() + "\t");
			System.out.print(list.get(i).getTot() + "\t");
			System.out.printf("%.1f\n", list.get(i).getAvg());
			
			count++;
			kor_tot += list.get(i).getKor();
			eng_tot += list.get(i).getEng();
			mat_tot += list.get(i).getMat();
		}
		
		System.out.println("\t\t\t학년총점\t" + kor_tot + "\t" + eng_tot + "\t" + mat_tot);
		System.out.printf("\t\t\t학년평균\t%.1f\t%.1f\t%.1f\n", (double)kor_tot / count, (double)eng_tot / count, (double)mat_tot / count);
	}

}
