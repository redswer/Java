package com.jslhrd.exservlet.util;
import java.sql.*;
public class DBManager {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//select을 수행후 리소스 해제 메소드
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//insert, update, delete을 수행후 리소스 해제 메소드
	public static void close(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
/*
	//select, insert,update,delete을 수행후 리소스 해제 메소드
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
*/
}
