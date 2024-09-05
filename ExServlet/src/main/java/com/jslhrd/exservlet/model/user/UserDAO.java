package com.jslhrd.exservlet.model.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jslhrd.exservlet.util.DBManager;

public class UserDAO {
	private UserDAO() {}
	
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public int userInsert(UserDTO dto) {
		String sql = "insert into tbl_user(name, userid, passwd, tel, email) values(?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getUserid());
			pstmt.setString(3, dto.getPasswd());
			pstmt.setString(4, dto.getTel());
			pstmt.setString(5, dto.getEmail());
			
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
		
		return row;
	}
	
	public int login(String userid, String passwd) {
		String sql = "select passwd from tbl_user where userid = ?";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String pass = rs.getString("passwd");
				if (pass.equals(passwd)) {
					row = 1;
					
					sql = "update tbl_user set last_time = sysdate where userid = ?";
					
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, userid);
					pstmt.executeUpdate();
				}
			} else {
				row = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return row;
	}
	
	public UserDTO userSelect(String userid) {
		String sql = "select * from tbl_user where userid = ?";
		UserDTO dto = new UserDTO();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				dto.setUserid(rs.getString("userid"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setTel(rs.getString("tel"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return dto;
	}
}
