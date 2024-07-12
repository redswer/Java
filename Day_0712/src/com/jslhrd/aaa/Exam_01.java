package com.jslhrd.aaa;

import java.sql.*;
import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "TRACK2_17";
		String myPW = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("** JDBC 드라이버 로딩 성공 **");
		} catch (Exception e) {
			System.out.println("** JDBC 드라이버 로딩 실패 => " + e.toString());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 입력 : ");
		int dno = sc.nextInt();
		
		try {
			con = DriverManager.getConnection(myURL, myID, myPW);
			String sql = "select eno, ename, job, manager, salary from emp where dno = ?";
			psmt = con.prepareStatement(sql);
			psmt.setInt(1, dno);
			rs = psmt.executeQuery();
			
			System.out.println("사원번호\t이름\t직업\t직급\t급여");
			while(rs.next()) {
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getString("manager") + "\t");
				System.out.print(rs.getInt("salary") + "\n");
			}
		} catch (Exception e) {
			e.toString();
		}
	}

}
