package com.jslhrd.exjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jslhrd.exjpa.entity.GuestEntity;

public interface GuestRepository extends JpaRepository<GuestEntity, Integer> {
	//작성자이름으로 검색 
    List<GuestEntity> findByName(String name);
    
    //idx를 기준으로 내림차순 정렬(findAll() : id기준으로 오름차순)
    //@Query(JPSQL :객체 지향 쿼리)
    //"select * from tbl_guest order by idx desc"
     @Query("select guest from GuestEntity guest order by guest.idx desc")
     List<GuestEntity> findAllDesc();
    
    //List<GuestEntity> findBySubject(String aaa);

}
