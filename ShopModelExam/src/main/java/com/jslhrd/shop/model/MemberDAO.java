package com.jslhrd.shop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.shop.util.DBManager;


public class MemberDAO {
	public int memberInsert(MemberDTO dto) {
		
		Connection con = DBManager.getConnection();
		PreparedStatement pstmt = null;
		
		int row = 0;
		String sql="insert into tbl_member values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2, dto.getCustname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getJoindate());
			pstmt.setString(6, dto.getGrade());
			pstmt.setString(7, dto.getCity());
			
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, null);
		}
		
		return row;
	}
	
	public int memberCount() {
		Connection con = DBManager.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int count = 0;
		String sql = "select count(*) as count from tbl_member";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return count;
	}
	
	public List<MemberDTO> memberList() {
		Connection con = DBManager.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<MemberDTO> list = new ArrayList<>();
		String sql = "select * from tbl_member";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
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
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return list;
	}
	
	public MemberDTO memberSelect(int custno) {
		Connection con = DBManager.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberDTO dto = new MemberDTO();
		String sql = "select * from tbl_member where custno = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, custno);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
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
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return dto;
	}
	
	public int memberModify(MemberDTO dto) {
		Connection con = DBManager.getConnection();
		PreparedStatement pstmt = null;
		
		int row = 0;
		String sql = "update tbl_member set custname = ?, phone = ?, gender = ?, joindate = ?, grade = ?, city = ? where custno = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getCustname());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getGender());
			pstmt.setString(4, dto.getJoindate());
			pstmt.setString(5, dto.getGrade());
			pstmt.setString(6, dto.getCity());
			pstmt.setInt(7, dto.getCustno());
			
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, null);
		}
		
		return row;
	}
	
	public List<MemberDTO> moneyList() {
		Connection con = DBManager.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		List<MemberDTO> list = new ArrayList<>();
		String sql = "select a.custno, a.custname, a.phone, a.grade, sum(b.pcost * b.amount) as sum"
				+" from tbl_member a, tbl_money b"
				+" where a.custno = b.custno"
				+" group by a.custno, a.custname, a.phone, a.grade"
				+" order by sum desc";
		
		try {
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
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return list;
	}
}
