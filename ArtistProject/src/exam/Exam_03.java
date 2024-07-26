package exam;

import java.util.List;
import java.util.Scanner;

import model.ArtistDAO;
import model.PointDTO;

public class Exam_03 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		PointDTO dto = new PointDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("채점번호 : ");
		dto.setSerial_no(Integer.parseInt(sc.nextLine()));
		
		System.out.print("참가번호 : ");
		dto.setArtist_id(sc.nextLine());
		
		System.out.print("멘토아이디 : ");
		dto.setMento_id(sc.nextLine());
		
		System.out.print("점수 : ");
		dto.setPoint(Integer.parseInt(sc.nextLine()));
		
		dao.insertPoint(dto);
		
		List<PointDTO> list = dao.PointList();
		
		System.out.println("채점번호\t참가번호\t멘토아이디\t점수");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSerial_no() + "\t");
			System.out.print(list.get(i).getArtist_id() + "\t");
			System.out.print(list.get(i).getMento_id() + "\t");
			System.out.print(list.get(i).getPoint() + "\n");
		}
	}

}
