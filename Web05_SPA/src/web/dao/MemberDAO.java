package web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import web.util.MyException;

public class MemberDAO {
	DataSource dbcp;

	public MemberDAO() throws MyException {
		try {
			Context ic = new InitialContext();
			Context ic2 = (Context) ic.lookup("java:comp/env");
			dbcp = (DataSource) ic2.lookup("jdbc/oracle");
		} catch (NamingException e) {
			e.printStackTrace();
			throw new MyException ("커넥션풀 찾기 실패");
		}
	}
	
	public String login(String id, String pw) throws MyException {
		Connection con= null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = dbcp.getConnection();
			stmt = con.prepareStatement("select memname from member where memid=? and pw=?");
			stmt.setString(1, id);
			stmt.setString(2, pw);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				String name = rs.getString("MEMNAME");
				System.out.println(name);
				return name;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new MyException ("login 처리 실패");
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
}