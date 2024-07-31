package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public int insertStudent(StudentDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into tbl_student_201905 values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getSyear());
			pstmt.setString(2, dto.getSclass());
			pstmt.setString(3, dto.getSno());
			pstmt.setString(4, dto.getSname());
			pstmt.setString(5, dto.getBirth());
			pstmt.setString(6, dto.getGender());
			pstmt.setString(7, dto.getTel1());
			pstmt.setString(8, dto.getTel2());
			pstmt.setString(9, dto.getTel3());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public List<StudentDTO> printAllStudent() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<>();
		
		String sql = "select * from tbl_student_201905 order by sclass, sno";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setSno(rs.getString("sno"));
				dto.setSname(rs.getString("sname"));
				dto.setBirth(rs.getString("birth"));
				dto.setGender(rs.getString("gender"));
				dto.setTel1(rs.getString("tel1"));
				dto.setTel2(rs.getString("tel2"));
				dto.setTel3(rs.getString("tel3"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insertScore(StudentDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into tbl_score_201905 values(?, ?, ?, ?, ?, ?)";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getSyear());
			pstmt.setString(2, dto.getSclass());
			pstmt.setString(3, dto.getSno());
			pstmt.setInt(4, dto.getKor());
			pstmt.setInt(5, dto.getEng());
			pstmt.setInt(6, dto.getMat());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public List<StudentDTO> printAllScore() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<>();
		
		String sql = "select * from tbl_score_201905 order by sclass, sno";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setSno(rs.getString("sno"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("kor") + rs.getInt("eng") + rs.getInt("mat"));
				dto.setAvg((rs.getInt("kor") + rs.getInt("eng") + rs.getInt("mat")) / 3.0);
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int deleteStudent(String bun) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql1 = "delete from tbl_score_201905 where syear = ? and sclass = ? and sno = ?";
		String sql2 = "delete from tbl_student_201905 where syear = ? and sclass = ? and sno = ?";
		int row = 0;
		
		try {
			con = getConnection();
			
			pstmt = con.prepareStatement(sql1);
			pstmt.setString(1, bun.substring(0, 1));
			pstmt.setString(2, bun.substring(1, 3));
			pstmt.setString(3, bun.substring(3, 5));
			row += pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, bun.substring(0, 1));
			pstmt.setString(2, bun.substring(1, 3));
			pstmt.setString(3, bun.substring(3, 5));
			row += pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public List<StudentDTO> printAllStudentScore() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<>();
		
		String sql = "select a.syear, a.sclass, a.sno, sname, gender, kor, eng, mat from tbl_student_201905 a, tbl_score_201905 b where a.sclass = b.sclass and a.sno = b.sno";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setSno(rs.getString("sno"));
				dto.setSname(rs.getString("sname"));
				
				String gender = "남";
				if(rs.getString("gender").equals("F")) {
					gender = "여";
				}
				dto.setGender(gender);
				
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("kor") + rs.getInt("eng") + rs.getInt("mat"));
				dto.setAvg((rs.getInt("kor") + rs.getInt("eng") + rs.getInt("mat")) / 3.0);
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<StudentDTO> printStatics() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentDTO> list = new ArrayList<>();
		
		String sql = "select a.syear, a.sclass, a.tname, sum(b.kor) as skor, sum(b.eng) as seng, sum(b.mat) as smat, avg(b.kor) as akor, avg(b.eng) as aeng, avg(b.mat) as amat"
				+ " from tbl_dept_201905 a, tbl_score_201905 b"
				+ " where a.sclass = b.sclass"
				+ " group by a.syear, a.sclass, a.tname";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				
				dto.setSyear(rs.getString("syear"));
				dto.setSclass(rs.getString("sclass"));
				dto.setTname(rs.getString("tname"));
				dto.setClass_k_tot(rs.getInt("skor"));
				dto.setClass_e_tot(rs.getInt("seng"));
				dto.setClass_m_tot(rs.getInt("smat"));
				dto.setClass_k_avg(rs.getDouble("akor"));
				dto.setClass_e_avg(rs.getDouble("aeng"));
				dto.setClass_m_avg(rs.getDouble("amat"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
