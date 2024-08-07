package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArtistDAO {
	private static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "TRACK2_17", "1234");
		
		return con;
	}
	
	public int joinArtist(ArtistDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into tbl_artist_201905 values(?, ?, ?, ?, ?, ?)";
		int result = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getArtist_id());
			pstmt.setString(2, dto.getArtist_name());
			pstmt.setString(3, dto.getArtist_gender());
			pstmt.setString(4, dto.getArtist_birth());
			pstmt.setString(5, dto.getTalent());
			pstmt.setString(6, dto.getAgency());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<ArtistDTO> artistList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ArtistDTO> list = new ArrayList<>();
		
		String sql = "select * from tbl_artist_201905";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ArtistDTO dto = new ArtistDTO();
				
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				
				String birth = rs.getString("artist_birth");
				String year = birth.substring(0, 4);
				String month = birth.substring(4, 6);
				String day = birth.substring(6, 8);
				dto.setArtist_birth(year + "년" + month + "월" + day + "일");
				
				String gender = "";
				if(rs.getString("artist_gender").equals("M")) {
					gender = ("남성");
				} else {
					gender = ("여성");
				}
				dto.setArtist_gender(gender);
				
				String talent = "";
				if(rs.getString("talent").equals("1")) {
					talent = "댄스";
				} else if(rs.getString("talent").equals("2")) {
					talent = "노래";
				} else {
					talent = "랩";
				}
				dto.setTalent(talent);
				
				dto.setAgency(rs.getString("agency"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int insertPoint(PointDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into tbl_point_201905 values(?, ?, ?, ?)";
		int result = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getSerial_no());
			pstmt.setString(2, dto.getArtist_id());
			pstmt.setString(3, dto.getMento_id());
			pstmt.setInt(4, dto.getPoint());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public List<PointDTO> PointList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<PointDTO> list = new ArrayList<>();
				
		String sql = "select * from tbl_point_201905";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				PointDTO dto = new PointDTO();
				
				dto.setSerial_no(rs.getInt("serial_no"));
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setMento_id(rs.getString("mento_id"));
				dto.setPoint(rs.getInt("point"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public List<ArtistDTO> artistPoitList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ArtistDTO> list = new ArrayList<>();
		
		String sql = "select serial_no, a.artist_id, a.artist_name, artist_birth, point, mento_name from tbl_artist_201905 a, tbl_point_201905 b, tbl_mento_201905 c where a.artist_id = b.artist_id and b.mento_id = c.mento_id order by serial_no";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ArtistDTO dto = new ArtistDTO();
				
				dto.setSerial_no(rs.getInt("serial_no"));
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				
				String birth = rs.getString("artist_birth");
				String year = birth.substring(0, 4);
				String month = birth.substring(4, 6);
				String day = birth.substring(6, 8);
				dto.setArtist_birth(year + "년" + month + "월" + day + "일");
				
				dto.setPoint(rs.getInt("point"));
				
				String grade = "F";
				switch (rs.getInt("point") / 10) {
				case 10:
				case 9:
					grade = "A";
					break;
				case 8:
					grade = "B";
					break;
				case 7:
					grade = "C";
					break;
				case 6:
					grade = "D";
					break;
				}
				dto.setGrade(grade);
				
				dto.setMento_name(rs.getString("mento_name"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int pointModify(PointDTO dto) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "update tbl_point_201905 set point = ? where serial_no = ?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getPoint());
			pstmt.setInt(2, dto.getSerial_no());
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public int[] deleteArtist(String artist_id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql1 = "delete from tbl_point_201905 where artist_id = ?";
		String sql2 = "delete from tbl_artist_201905 where artist_id = ?";
		int row1 = 0;
		int row2 = 0;
		int[] row = new int[2];
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql1);
			pstmt.setString(1, artist_id);
			row1 = pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1, artist_id);
			row2 = pstmt.executeUpdate();
			
			row[0] = row1;
			row[1] = row2;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public int deletePoint(int serial_no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete from tbl_point_201905 where serial_no = ?";
		int row = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, serial_no);
			row = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	public List<ArtistDTO> rank() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ArtistDTO> list = new ArrayList<>();
		
		String sql = "select a.artist_id, a.artist_name, a.artist_gender, sum(b.point) as sum, round(avg(b.point), 2) as avg "
				+ "from tbl_artist_201905 a, tbl_point_201905 b "
				+ "where a.artist_id = b.artist_id "
				+ "group by a.artist_id, a.artist_name, a.artist_gender "
				+ "order by sum desc";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ArtistDTO dto = new ArtistDTO();
				
				dto.setArtist_id(rs.getString("artist_id"));
				dto.setArtist_name(rs.getString("artist_name"));
				
				String gender = "남성";
				if (rs.getString("artist_gender").equals("F")) {
					gender = "여성";
				}
				dto.setArtist_gender(gender);
				
				dto.setSum(rs.getInt("sum"));
				dto.setAvg(rs.getDouble("avg"));
				dto.setRank(0);
				
				list.add(dto);
			}
			
			for (int i = 0; i < list.size(); i++) {
				int rank = 1;
				for (int j = 0; j < list.size(); j++) {
					if(list.get(i).getAvg() < list.get(j).getAvg()) {
						rank ++;
					}
				}
				list.get(i).setRank(rank);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
