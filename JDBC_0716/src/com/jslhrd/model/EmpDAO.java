package com.jslhrd.model;

import java.sql.*;
import java.util.*;

public class EmpDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public void dbtest() {
		Connection con = null;
		
		try {
			con = getConnection();
			System.out.println(con.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int count() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "select count(*) as count from emp";
		int count = 0;
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			if(rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			
		}
		
		return count;
	}
	
	public int dno_count() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "select count(distinct(dno)) as count from emp";
		int count = 0;
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			if(rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			
		}
		
		return count;
	}
	
	public List<DnoCountDTO> dnoCount() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		List<DnoCountDTO> list = new ArrayList<>();
		String dname = "";
		
		String sql = "select dno, count(*) as count from emp group by dno order by dno";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				DnoCountDTO dc = new DnoCountDTO();
				
				switch (rs.getInt("dno")) {
				case 10:
					dname = "전산부";
					break;
				case 20:
					dname = "총무부";
					break;
				case 30:
					dname = "인사부";
					break;
				case 40:
					dname = "경영부";
					break;
				}
				
				dc.setDno(dname);
				dc.setCount(rs.getInt("count"));
				list.add(dc);
			}
		} catch (Exception e) {
			
		}
		
		return list;
	}
}
