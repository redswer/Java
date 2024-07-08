import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("** JDBC 드라이버 로딩 성공 **");
		} catch (Exception e) {
			System.out.println("** JDBC 드라이버 로딩 실패 => " + e.toString());
		}
		
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(url, "TRACK2_17", "1234");
			System.out.println("** 커넥션 연결 성공 **");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from dept");
			
			System.out.println("부서\t번호\t\t지역");
			while(rs.next()) {
				System.out.print(rs.getInt("dno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				if (rs.getString("dname").length() < 6) {
					System.out.print("\t" + rs.getString("loc") + "\t");
				} else {
					System.out.print(rs.getString("loc") + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("** 커넥션 연결 실패 => " + e.toString());
		}
	}

}
