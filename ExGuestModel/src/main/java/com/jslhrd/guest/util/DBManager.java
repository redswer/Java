package com.jslhrd.guest.util;

import java.sql.*;

public class DBManager {
	public static Connection getConnection() {
		Connection con = null;
		
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "track2_17", "1234");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
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