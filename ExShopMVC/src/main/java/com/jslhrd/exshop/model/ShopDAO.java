package com.jslhrd.exshop.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jslhrd.exshop.util.DBManager;

public class ShopDAO {
	private ShopDAO() {}
	
	private static ShopDAO instance = new ShopDAO();
	
	public static ShopDAO getInstance() {
		return instance;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public List<CityDTO> cityList() {
		String sql = "select * from tbl_city";
		List<CityDTO> list = new ArrayList<>();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CityDTO dto = new CityDTO();
				dto.setCity(rs.getString("city"));
				dto.setCityname(rs.getString("cityname"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return list;
	}
	
	public int memberInsert(MemberDTO dto) {
		String sql = "insert into tbl_member values(?, ?, ?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCustno());
			pstmt.setString(2, dto.getCustname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getJoindate());
			pstmt.setString(6, dto.getGrade());
			pstmt.setString(7, dto.getCity());
			
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(con, pstmt);
		}
		
		return row;
	}
	
	public List<CommonDTO> memberList() {
		String sql = "select custno, custname, phone, gender, joindate, grade, c.cityname from tbl_member m, tbl_city c where m.city = c.city order by joindate desc";
		List<CommonDTO> list = new ArrayList<>();
		
		try {
			con = DBManager.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO mdto = new MemberDTO();
				CityDTO cdto = new CityDTO();
				CommonDTO dto = new CommonDTO();
				
				mdto.setCustno(rs.getInt("custno"));
				mdto.setCustname(rs.getString("custname"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setGender(rs.getString("gender"));
				mdto.setJoindate(rs.getString("joindate"));
				mdto.setGrade(rs.getString("grade"));
				
				cdto.setCityname(rs.getString("cityname"));
				
				dto.setMember(mdto);
				dto.setCity(cdto);
				
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
