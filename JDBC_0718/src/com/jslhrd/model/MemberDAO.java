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
	
	public List<MemberDTO> memberList() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		List<MemberDTO> list = new ArrayList<>();
		
		String sql = "select * from TBL_MEMBER_001";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				dto.setJoindate(rs.getString("joindate"));
				dto.setGrade(rs.getString("grade"));
				dto.setCity(rs.getString("city"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}