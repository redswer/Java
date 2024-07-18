package com.jslhrd.model;

import java.sql.*;
import java.util.*;

public class ExamDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public List<ExamDTO> findScott(String name) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		List<ExamDTO> list = new ArrayList<>();
		
		String sql = "select e.eno, e.ename, e.dno, d.dname from emp e, dept d where e.dno = d.dno and e.ename = ?";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();

			while(rs.next()) {
				ExamDTO dto = new ExamDTO();
				
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setDno(rs.getInt("dno"));
				dto.setDname(rs.getString("dname"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
