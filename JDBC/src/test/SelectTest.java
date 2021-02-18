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
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			System.out.println("Connection Success");
		
		// 3. Statement
			stmt = con.createStatement();
			System.out.println("Statement Success");
			
		// 4. SQL 전송
			rs = stmt.executeQuery("select * from member");
			
		// 5. 결과 얻기
			System.out.println("This is the Result");
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String date = rs.getString(3);
				String phone = rs.getString(4);
				int point = rs.getInt(5);
				System.out.println(id+":"+name+":"+date+":"+phone+":"+point);
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
