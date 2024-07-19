package com.jslhrd.exam;

import java.util.List;

import com.jslhrd.model.EmpDAO;
import com.jslhrd.model.EmpDTO;

public class Exam_02 {

	public static void main(String[] args) {
//		이름이 k 가 포함된 사원과 같은 부서에서 잃하는 사원번호와 이름 출력
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.findName();
		
		System.out.println("사원번호\t이름");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getEno() + "\t");
			System.out.print(list.get(i).getEname() + "\n");
		}
	}

}
