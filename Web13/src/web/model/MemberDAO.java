package web.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import web.util.MemberVO;
import web.util.MyException;

public class MemberDAO {

	// 1. 드라이버 등록
	public MemberDAO() throws MyException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new MyException("드라이버 등록 실패");
		}
	}

	public void memberInsert(MemberVO m) throws MyException {		
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			// 2. Connection
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			// 3. Statement
			stmt = con.prepareStatement("Insert into member(MEMID, MEMNAME) values (?,?)");
			
			// 4. SQL 전송
			stmt.setString(1, m.getId());
			stmt.setString(2, m.getName());
			int i = stmt.executeUpdate();
			
			// 5. 결과확인
			System.out.println(i + "행이 insert 되었습니다");
			
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new MyException("연결 실패 [회원가입 오류]");
			
			// 6. 종료
		} finally {
				try {
					if(stmt != null) stmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
				}
		}
		
	}
}
