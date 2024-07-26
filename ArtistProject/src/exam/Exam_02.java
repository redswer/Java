package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_02 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
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
