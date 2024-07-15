package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ExamDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public void test() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
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
		
		String sql = "select count(*) as counter from emp";
		int count = 0;
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			if(rs.next()) {
				count = rs.getInt("counter");
			}
		} catch (Exception e) {
			
		}
		
		return count;
	}
	
	public EmpDTO find_name() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "select * from emp where ename = ?";
		EmpDTO dto = new EmpDTO();
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setString(1, "SCOTT");
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setManager(rs.getString("manager"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
			}
		} catch (Exception e) {
			
		}
		
		return dto;
	}
	
	public List<EmpDTO> find_dno(int dno) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "select * from emp where dno = ?";
		List<EmpDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, dno);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setManager(rs.getString("manager"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			
		}
		
		return list;
	}
	
	public List<EmpDTO> find_salary(int salary) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "select eno, ename, salary from emp where salary >= ? order by salary desc";
		List<EmpDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, salary);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setSalary(rs.getInt("salary"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			
		}
		
		return list;
	}
	
	public List<EmpDTO> bonus(int dno) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String sql = "select eno, ename, salary, salary * 12 as bonus from emp where dno = ?";
		List<EmpDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, dno);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setSalary(rs.getInt("salary"));
				dto.setBonus(rs.getInt("bonus"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			
		}
		
		return list;
	}
}
