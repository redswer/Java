package com.jslhrd.score.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jslhrd.score.util.DBManager;

public class ScoreDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private ScoreDAO() {}
	
	private static ScoreDAO instance = new ScoreDAO();
	
	public static ScoreDAO getInstance() {
		return instance;
	}
	
	public int studentInsert(CommDTO cdto, StudentDTO dto) {
		String sql = "insert into tbl_student_001 values(?, ?, ?, ?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, cdto.getHakbun());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPhone1());
			pstmt.setString(4, dto.getPhone2());
			pstmt.setString(5, dto.getPhone3());
			pstmt.setString(6, dto.getBirth());
			pstmt.setString(7, dto.getGender());
			pstmt.setString(8, dto.getRegdate());
			
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public List<StudentDTO> studentList() {
		String sql = "select * from tbl_student_001";
		List<StudentDTO> list = new ArrayList<>();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				
				dto.setHakbun(rs.getString("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setPhone1(rs.getString("phone1"));
				dto.setPhone2(rs.getString("phone2"));
				dto.setPhone3(rs.getString("phone3"));
				dto.setGender(rs.getString("gender"));
				dto.setBirth(rs.getString("birth"));
				dto.setRegdate(rs.getString("regdate"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int scoreInsert(CommDTO cdto, ScoreDTO dto) {
		String sql = "insert into tbl_score_001 values(?, ?, ?, ?)";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, cdto.getHakbun());
			pstmt.setInt(2, dto.getKor());
			pstmt.setInt(3,  dto.getEng());
			pstmt.setInt(4, dto.getMat());
			
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public List<StudentDTO> scoreList() {
		String sql = "select a.hakbun, a.name, a.gender, b.kor, b.eng, b.mat, b.kor+b.eng+b.mat as sum, round((b.kor+b.eng+b.mat)/3, 1) as avg"
				+ " from tbl_student_001 a, tbl_score_001 b"
				+ " where a.hakbun = b.hakbun";
		List<StudentDTO> list = new ArrayList<>();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				
				dto.setHakbun(rs.getString("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setGender(rs.getString("gender"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setSum(rs.getInt("sum"));
				dto.setAvg(rs.getDouble("avg"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
