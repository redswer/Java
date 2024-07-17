package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public List<EmpDTO> empList() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		List<EmpDTO> list = new ArrayList<>();
		
		String sql = "select eno, ename, job, hiredate, salary, dno from emp";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				String str = rs.getString("hiredate");
				dto.setHiredate(str.substring(0, 4) + "년" + str.substring(5, 7) + "월" + str.substring(8, 10) + "일");
				dto.setSalary(rs.getInt("salary"));
				dto.setDno(rs.getInt("dno"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public EmpDTO searchEno(int eno) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		EmpDTO dto = new EmpDTO();
		
		String sql = "select eno, ename, job, hiredate, salary, dno from emp where eno = ?";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, eno);
			rs = psmt.executeQuery();

			if(rs.next()) {
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				String str = rs.getString("hiredate");
				dto.setHiredate(str.substring(0, 4) + "년" + str.substring(5, 7) + "월" + str.substring(8, 10) + "일");
				dto.setSalary(rs.getInt("salary"));
				dto.setDno(rs.getInt("dno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
	public SalaryDTO salaryCount() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		SalaryDTO dto = new SalaryDTO();
		
		String sql = "select max(salary) as max, min(salary) as min, sum(salary) as sum, avg(salary) as avg from emp";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			if(rs.next()) {
				dto.setMax(rs.getInt("max"));
				dto.setMin(rs.getInt("min"));
				dto.setSum(rs.getInt("sum"));
				dto.setAvg(rs.getDouble("avg"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}
	
	public List<DepartDTO> dInfo() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		List<DepartDTO> list = new ArrayList<>();
		
		String sql = "select dno, count(*) as count, avg(salary) as avg from emp group by dno";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				DepartDTO dto = new DepartDTO();
				
				dto.setDno(rs.getInt("dno"));
				dto.setCount(rs.getInt("count"));
				dto.setSalary_avg(rs.getDouble("avg"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<SalaryDTO> jobSalary() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		List<SalaryDTO> list = new ArrayList<>();
		
		String sql = "select job, max(salary) as max, min(salary) as min from emp group by job having min(salary) >= 2000 order by max desc";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				SalaryDTO dto = new SalaryDTO();
				
				dto.setJob(rs.getString("job"));
				dto.setMax(rs.getInt("max"));
				dto.setMin(rs.getInt("min"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<DepartDTO> departInfo() {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		List<DepartDTO> list = new ArrayList<>();
		
		String sql = "select dno, count(*) as count, avg(salary) as avg from emp group by dno";
		
		try {
			con = getConnection();
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				DepartDTO dto = new DepartDTO();
				
				dto.setDno(rs.getInt("dno"));
				dto.setCount(rs.getInt("count"));
				dto.setSalary_avg(rs.getDouble("avg"));
				
				switch (rs.getInt("dno")) {
				case 10:
					dto.setDname("ACCOUNTING");
					break;
				case 20:
					dto.setDname("RESEARCH");
					break;
				case 30:
					dto.setDname("SALES");
					break;
				case 40:
					dto.setDname("OPERATION");
					break;
				}
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
