package exam;

import java.util.List;
import java.util.Scanner;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_05 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("참가번호 : ");
		String id = sc.nextLine();
		
		int[] data = dao.deleteArtist(id);
		if(data[0] + data[1] == 0) {
			System.out.println("없는 데이터");
		} else {
			System.out.println("point 테이블에서 " + data[0] + "개의 데이터 삭제됨");
			System.out.println("arist 테이블에서 " + data[1] + "개의 데이터 삭제됨");
		}
		
		List<ArtistDTO> list = dao.artistList();
		
		System.out.println("참가번호\t참가자명\t생년월일\t\t성별\t특기\t소속사");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getArtist_id() + "\t");
			System.out.print(list.get(i).getArtist_name() + "\t");
			System.out.print(list.get(i).getArtist_birth() + "\t");
			System.out.print(list.get(i).getArtist_gender() + "\t");
			System.out.print(list.get(i).getTalent() + "\t");
			System.out.print(list.get(i).getAgency() + "\n");
		}
	}

}
