package com.jslhrd.shop.util;

import java.sql.*;

public class DBManager {
	public static Connection getConnection() {
		Connection con = null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	// 쿼리문 실행 후 리소스 해제
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}