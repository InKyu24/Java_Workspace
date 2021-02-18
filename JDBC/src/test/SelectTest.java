package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt =null;
		ResultSet rs = null;
		
		try {	
		// 1. Driver Loading
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loading Success");
		
		// 2. Connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SHOP", "1313");
			System.out.println("Connection Success");
		
		// 3. Statement
			stmt = con.createStatement();
			System.out.println("Statement Success");
			
		// 4. SQL 전송
			rs = stmt.executeQuery("select * from memberTBL");
			
		// 5. 결과 얻기
			System.out.println("This is the Result");
			while(rs.next()) {
				String id = rs.getString("MEMBERID");
				String name = rs.getString("MEMBERNAME");
				String addr = rs.getString(3);
				System.out.println(id+":"+name+":"+addr);
			}	
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
