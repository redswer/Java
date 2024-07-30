package exam;

import java.util.List;
import java.util.Scanner;

import model.ArtistDAO;
import model.ArtistDTO;
import model.PointDTO;

public class Exam_04 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		PointDTO dto = new PointDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("채점번호 : ");
		int serial_no = Integer.parseInt(sc.nextLine());
		
		System.out.print("점수 : ");
		int point = Integer.parseInt(sc.nextLine());
		
		dto.setSerial_no(serial_no);
		dto.setPoint(point);
		
		int data = dao.pointModify(dto);
		if (data == 0) {
			System.out.println("없는 데이터");
		} else {
			System.out.println(data + "개의 데이터 수정됨");
		}
		
		List<ArtistDTO> list = dao.artistPoitList();
		
		System.out.println("채점번호\t참가번호\t참가자명\t생년월일\t\t점수\t평점\t멘토");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getSerial_no() + "\t");
			System.out.print(list.get(i).getArtist_id() + "\t");
			System.out.print(list.get(i).getArtist_name() + "\t");
			System.out.print(list.get(i).getArtist_birth() + "\t");
			System.out.print(list.get(i).getPoint() + "\t");
			System.out.print(list.get(i).getGrade() + "\t");
			System.out.print(list.get(i).getMento_name() + "\n");
		}
	}

}
