package com.jslhrd.exjpa.jpatest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.jslhrd.exjpa.dto.GuestResponseDTO;
import com.jslhrd.exjpa.entity.GuestEntity;
import com.jslhrd.exjpa.repository.GuestRepository;

@SpringBootTest
@TestPropertySource(locations="classpath:application-test.properties")
public class GuestRepositoryTest {
	@Autowired
	GuestRepository guestRepository;
	//등록
	@Test
	public void createGuestTest() {
		//GuestEntity guest = new GuestEntity("김학생","제목입니다","내용입니다");
		GuestEntity entity = GuestEntity.builder()
				.name("김학생")
				.subject("김학생 제목 테스트")
				.contents("김학생 내용 테스트")
				.build();
		
		GuestEntity guest = guestRepository.save(entity);
		GuestResponseDTO resDTO = new GuestResponseDTO(guest);
		System.out.println("등록된 idx : " + resDTO.getIdx());
	}
/*
	//idx 검색
	@Test
	public void idxSearchTest() {
		this.createGuestTest();
		//idx 값이 1인 데이터 검색
		GuestEntity entity = guestRepository.findById(2)
				.orElseThrow(()->new IllegalArgumentException("idx없음"));
		
		GuestResponseDTO resDTO = new GuestResponseDTO(entity);
		System.out.println("검색결과 : 이름 " + resDTO.getName());
	}

	//게시글 수 카운트
	@Test
	public void countTest() {
		this.createGuestTest();
		long count = guestRepository.count();
		
		System.out.println("전체 글수 : " + count);
	}
	
	//게시글 전체목록
	@Test
	public void findAllTest() {
		this.createGuestTest();
		this.createGuestTest();
		List<GuestEntity> gList = guestRepository.findAll();
		for(GuestEntity entity : gList) {
			GuestResponseDTO guest = new GuestResponseDTO(entity);
			System.out.print(guest.getIdx() + "  ");
			System.out.print(guest.getName() + "  ");
			System.out.print(guest.getSubject() + "  ");
			System.out.println(guest.getContents());
		}
	}
/*	
	//작성자 이름이 xxx인 모든 자료 검색(사용자 정의 메소드)
	@Test
	public void findByNameTest() {
		this.createGuestTest();
		List<GuestEntity> gList = guestRepository.findByName("김학생");
		System.out.println("이름으로 검색 결과");
		for(GuestEntity entity : gList) {
			GuestResponseDTO guest = new GuestResponseDTO(entity);
			System.out.print(guest.getIdx() + "  ");
			System.out.print(guest.getName() + "  ");
			System.out.print(guest.getSubject() + "  ");
			System.out.println(guest.getContents());
		}
	}
*/

	//게시글 전체목록
	@Test
	public void findAllDescTest() {
		this.createGuestTest();
		this.createGuestTest();
		List<GuestEntity> gList = guestRepository.findAllDesc();
		for(GuestEntity entity : gList) {
			GuestResponseDTO guest = new GuestResponseDTO(entity);
			System.out.print(guest.getIdx() + "  ");
			System.out.print(guest.getName() + "  ");
			System.out.print(guest.getSubject() + "  ");
			System.out.println(guest.getContents());
		}
	}
	
}
