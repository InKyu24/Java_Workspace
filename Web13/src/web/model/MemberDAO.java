package web.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			stmt = con.prepareStatement("Insert into member(MEMID, MEMNAME, SUBJECT, PW) values (?,?,?,?)");
			
			// 4. SQL 전송
			stmt.setString(1, m.getId());
			stmt.setString(2, m.getName());
			String subject = "";
			for (String s: m.all_subject) {
				subject += s+", ";
			}
			stmt.setString(3, subject);
			stmt.setString(4, m.getPw());
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
	
	public List<MemberVO> listMember() throws MyException {
		List<MemberVO> list = new ArrayList <MemberVO> ();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			stmt = con.prepareStatement("select * from member");
			rs = stmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("memid");
				String name = rs.getString("memname");
				String pw = rs.getString("pw");
				MemberVO m = new MemberVO(id, pw, name);
				list.add(m);
		} return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new MyException("모든 고객 조회 실패");
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public String login (String id, String pw) throws MyException {
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			stmt = con.prepareStatement("select * from member where memid=? and pw=?");
			stmt.setString(1, id);
			stmt.setString(2, pw);
			
			rs = stmt.executeQuery();
			if (rs.next()) {
				
				String name = rs.getString("memname");
				return name;
				
			} return null;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new MyException("로그인 실패");
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
			}
		}
	}
}
