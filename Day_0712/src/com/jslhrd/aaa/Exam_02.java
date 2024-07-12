package com.jslhrd.aaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Exam_02 {
	// 문제 1) 급여가 2000 에서 3000 사이에 포함되지 않은 사원의 이름과 급여를 출력
	// 문제 2) 입사년도가 82년 이후인 사원의 번호, 이름, 업무, 입사일, 급여, 부서번호 출력
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		String myURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String myID = "TRACK2_17";
		String myPW = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(myURL, myID, myPW);
			
			System.out.print("제외할 급여 범위 입력 : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			String sql1 = "select ename, salary from emp where salary not between ? and ?";
			psmt = con.prepareStatement(sql1);
			psmt.setInt(1, a);
			psmt.setInt(2, b);
			rs = psmt.executeQuery();
			
			System.out.println("이름\t급여");
			while(rs.next()) {
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getInt("salary") + "\n");
			}
			
			System.out.println("----------------------------------------");
			
			System.out.print("연도 입력 : ");
			int year = sc.nextInt();
			
			String sql2 = "select eno, ename, job, hiredate, salary, dno from emp where to_number(substr(to_char(hiredate, 'YYDDMM'), 1, 2)) >= ?";
			psmt = con.prepareStatement(sql2);
			psmt.setInt(1, year);
			rs = psmt.executeQuery();
			
			System.out.println("번호\t이름\t업무\t입사일자\t\t급여\t부서번호");
			while(rs.next()) {
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getDate("hiredate") + "\t");
				System.out.print(rs.getInt("salary") + "\t");
				System.out.print(rs.getInt("dno") + "\n");
			}
		} catch (Exception e) {
			
		}
	}

}
