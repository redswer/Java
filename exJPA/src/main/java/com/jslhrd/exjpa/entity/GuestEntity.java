package com.jslhrd.exjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_guest")
@Getter
@NoArgsConstructor
public class GuestEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) //=> 자동증가 (DB 가 MySQL 일 때)
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tbl_guest_seq_idx.GENERATOR")
	@SequenceGenerator(name = "tbl_guest_seq_idx.GENERATOR", sequenceName = "tbl_guest_seq_idx", initialValue = 1, allocationSize = 1)
	//=> 자동증가 (DB 가 Oracle 일 때)
	private int idx;
	
	private String name;
	private String subject;
	private String contents;
	private String regdate;
	private int readcnt;
//	private String pass;
	
	@Builder
	public GuestEntity(String name, String subject,String contents) {
		this.name=name;
		this.subject=subject;
		this.contents=contents;
	}
}
