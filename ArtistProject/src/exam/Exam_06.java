package exam;

import java.util.List;
import java.util.Scanner;

import model.ArtistDAO;
import model.PointDTO;

public class Exam_06 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("채점번호 : ");
		int serial_no = Integer.parseInt(sc.nextLine());
		
		int data = dao.deletePoint(serial_no);
		if (data == 0) {
			System.out.println("없는 데이터");
		} else {
			System.out.println(data + "개의 데이터 삭제됨\n");
		}
		
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
