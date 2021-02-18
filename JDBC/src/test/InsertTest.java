package test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertTest {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt =null;
		ResultSet rs = null;
		
		try {	
		// 1. Driver Loading
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loading Success");
		
		// 2. Connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			System.out.println("Connection Success");

		// 3. Statement
 			stmt = con.prepareStatement("insert into member values(?,?,?,?,?)"); 
 			stmt.setString(1,args[0]);
			stmt.setString(2,args[1]);
			java.util.Date today = new java.util.Date();
			Date now = new Date(today.getTime());
			stmt.setDate(3, now);
			stmt.setString(4,args[2]);
			stmt.setInt(5,0);
			System.out.println("Statement Success");
			
		// 4. SQL 전송
			int i = stmt.executeUpdate();
			
		// 5. 결과 얻기
			System.out.println("This is the Result");
			System.out.println(i+"행이 Insert되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			
		// 6. 자원종료
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if (stmt!=null) {stmt.close();}
				if (con!=null) {con.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			} 	
		}
	}
}

