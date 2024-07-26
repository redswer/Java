package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_07 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
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
