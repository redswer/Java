package com.jslhrd.score.util;

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
}