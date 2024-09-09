package com.jslhrd.exservlet.model.pds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.exservlet.util.DBManager;

public class PdsDAO {
	private PdsDAO() {}
	
	private static PdsDAO instance = new PdsDAO();
	public static PdsDAO getInstance() {
		return instance;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public int pdsCount() {
		String sql = "select count(*) from tbl_pds";
		int count = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return count;
	}
	
	public List<PdsDTO> pdsList() {
		String sql = "select * from tbl_pds order by idx desc";
		List<PdsDTO> list = new ArrayList<>();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PdsDTO dto = new PdsDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getString("readcnt"));
				dto.setFilename(rs.getString("filename"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return list;
	}
	
	public int pdsCount(String search, String key) {
		String sql = "select count(*) from tbl_pds where " + search + " like ?";
		int count = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return count;
	}
	
	public List<PdsDTO> pdsList(String search, String key) {
		String sql = "select * from tbl_pds where " + search + " like ? order by idx desc";
		List<PdsDTO> list = new ArrayList<>();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + key + "%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PdsDTO dto = new PdsDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setEmail(rs.getString("email"));
				dto.setName(rs.getString("name"));
				dto.setSubject(rs.getString("subject"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getString("readcnt"));
				dto.setFilename(rs.getString("filename"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return list;
	}
	
	public PdsDTO pdsView(int idx) {
		String sql = "select * from tbl_pds where idx = ?";
		PdsDTO dto = new PdsDTO();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dto.setIdx(idx);
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setSubject(rs.getString("subject"));
				dto.setContents(rs.getString("contents"));
				dto.setRegdate(rs.getString("regdate"));
				dto.setReadcnt(rs.getString("readcnt"));
				dto.setFilename(rs.getString("filename"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
		
		return dto;
	}
	
	public void pdsReadcnt(int idx) {
		String sql = "update tbl_pds set readcnt = readcnt + 1";
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
	}
	
	public int pdsDelete(int idx, String pass) {
		String sql = "delete from tbl_pds where idx = ? and pass = ?";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, pass);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
		
		return row;
	}
	
	public int pdsWrite(PdsDTO dto) {
		String sql = "insert into tbl_pds(idx, name, pass, email, subject, contents, filename) values(tbl_pds_seq_idx.nextval, ?, ?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPass());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getSubject());
			pstmt.setString(5, dto.getContents());
			pstmt.setString(6, dto.getFilename());
			
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
		
		return row;
	}
	
	public int pdsModify(PdsDTO dto) {
		String sql = "update tbl_pds set email = ?, subject = ?, contents = ?, filename = ? where idx = ? and pass = ?";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmail());
			pstmt.setString(2, dto.getSubject());
			pstmt.setString(3, dto.getContents());
			pstmt.setString(4, dto.getFilename());
			pstmt.setInt(5, dto.getIdx());
			pstmt.setString(6, dto.getPass());
			
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
		
		return row;
	}
}
