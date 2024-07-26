package exam;

import java.util.Scanner;

import model.ArtistDAO;
import model.ArtistDTO;

public class Exam_01 {

	public static void main(String[] args) {
		ArtistDAO dao = new ArtistDAO();
		ArtistDTO dto = new ArtistDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("참가번호 : ");
		dto.setArtist_id(sc.nextLine());
		
		System.out.print("이름 : ");
		dto.setArtist_name(sc.nextLine());
		
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		if(gender.equals("남자") || gender.toUpperCase().equals("M")) {
			dto.setArtist_gender("M");
		} else {
			dto.setArtist_gender("F");
		}
		
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();
		if(birth.length() == 6) {
			if(Integer.parseInt(birth.substring(0, 2)) > 14) {
				birth = "19" + birth;
			} else {
				birth = "20" + birth;
			}
		}
		dto.setArtist_birth(birth);
		
		System.out.print("특기 : ");
		String talent = sc.nextLine();
		String talent_code = "";
		if(talent.equals("댄스") || talent.equals("1")) {
			talent_code = "1";
		} else if (talent.equals("랩") || talent.equals("2")) {
			talent_code = "2";
		} else if(talent.equals("노래") || talent.equals("3")) {
			talent_code = "3";
		}
		dto.setTalent(talent_code);
		
		System.out.print("소속사 : ");
		dto.setAgency(sc.nextLine());
		
		if (dao.joinArtist(dto) == 1) {
			System.out.println("등록이 완료되었습니다.");
		} else {
			System.out.println("등록 실패");
		}
	}

}
