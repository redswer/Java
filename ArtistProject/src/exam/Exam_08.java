package exam;

import java.util.List;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_08 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		List<ArtistDTO> list = dao.rank();

		System.out.println("참가번호\t참가자명\t성별\t총점\t평균\t등수");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getArtist_id() + "\t");
			System.out.print(list.get(i).getArtist_name() + "\t");
			System.out.print(list.get(i).getArtist_gender() + "\t");
			System.out.print(list.get(i).getSum() + "\t");
			System.out.printf("%.2f\t", list.get(i).getAvg());
			System.out.print(list.get(i).getRank() + "\n");
		}
	}

}
