package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExamDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public int createTable() {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int row = 0;
		String sql = "create table student(\r\n"
				+ "    hakbun char(4) primary key,\r\n"
				+ "    name varchar2(20) not null,\r\n"
				+ "    gender char(1),\r\n"
				+ "    score number(3)\r\n"
				+ ")";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			row = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public int insertCity(CityDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into tbl_city values(?, ?)";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getCity());
			pstmt.setString(2, dto.getCityname());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
}
