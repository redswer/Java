package com.jslhrd.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MoneyDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public int insert(MoneyDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int row = 0;
		String sql = "insert into tbl_money values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCustno());
			pstmt.setInt(2, dto.getSaleno());
			pstmt.setInt(3, dto.getPcost());
			pstmt.setInt(4, dto.getAmount());
			pstmt.setInt(5, dto.getPrice());
			pstmt.setString(6, dto.getPcode());
			pstmt.setString(7, dto.getSdate());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public List<MoneyDTO> selectAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MoneyDTO> list = new ArrayList<>();
		String sql = "select * from tbl_money";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MoneyDTO dto = new MoneyDTO();
				
				dto.setCustno(rs.getInt("custno"));
				dto.setSaleno(rs.getInt("saleno"));
				dto.setPcost(rs.getInt("pcost"));
				dto.setAmount(rs.getInt("amount"));
				dto.setPrice(rs.getInt("price"));
				dto.setPcode(rs.getString("pcode"));
				String year = rs.getString("sdate").substring(0, 4) + "년";
				String month = rs.getString("sdate").substring(4, 6) + "월";
				String day = rs.getString("sdate").substring(6, 8) + "일";
				dto.setSdate(year + month + day);
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<MemberDTO> memberList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDTO> list = new ArrayList<>();
		String sql = "select custno, custname, phone, gender, joindate, grade, cityname from tbl_member m, tbl_city c where m.city = c.city";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGender(rs.getString("gender"));
				
				if (rs.getString("joindate") != null) {
					String year = rs.getString("joindate").substring(0, 4) + "년";
					String month = rs.getString("joindate").substring(4, 6) + "월";
					String day = rs.getString("joindate").substring(6,8) + "일";
					dto.setJoindate(year + month + day);
				}
				
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
				dto.setCityname(rs.getString("cityname"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<MemberDTO> memberMoney() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDTO> list = new ArrayList<>();
		String sql = "select a.custno, a.custname, a.phone, a.grade, sum(b.price) as sum FROM tbl_member a JOIN tbl_money b ON a.custno = b.custno GROUP BY a.custno, a.custname, a.phone, a.grade";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setCustno(rs.getInt("custno"));
				dto.setCustname(rs.getString("custname"));
				dto.setPhone(rs.getString("phone"));
				dto.setGrade(rs.getString("grade"));
				dto.setSum(rs.getInt("sum"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
