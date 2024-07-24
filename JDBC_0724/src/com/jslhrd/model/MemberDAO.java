package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public int memberCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		
		String sql = "select count(*) as count from tbl_member";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public List<MemberDTO> memberList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDTO> list = new ArrayList<>();
		String sql = "select * from tbl_member";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				if(rs.getString("gender").equals("M")) {
					dto.setGender("남자");
				} else {
					dto.setGender("여자");
				}
				String year = rs.getString("joindate").substring(0, 4) + "년 ";
				String month = rs.getString("joindate").substring(4, 6) + "월 ";
				String day = rs.getString("joindate").substring(6,8) + "일";
				dto.setJoindate(year + month + day);
				
				String grade = "";
				switch (rs.getString("grade")) {
				case "A":
					grade = "VIP";
					break;
				case "B":
					grade = "일반";
					break;
				case "C":
					grade = "직원";
					break;
				}
				dto.setGrade(grade);
				dto.setCity(rs.getString("city"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public MemberDTO search(int custno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO dto = new MemberDTO();
		String sql = "select * from tbl_member where custno = ?";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, custno);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setJoindate(rs.getString("joindate"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
	public int joinMember(MemberDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into tbl_member(custno, custname, phone, gender, joindate, grade, city) values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2, dto.getCustname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getJoindate());
			pstmt.setString(6, dto.getGrade());
			pstmt.setString(7, dto.getCity());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
}
