package web.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import web.util.Myexception;

public class MemberDAO {

	DataSource dbcp;
	
	public MemberDAO() throws Myexception {
		try {
			Context initial = new InitialContext();
			Context environment = (Context)initial.lookup("java:comp/env");
			dbcp = (DataSource) environment.lookup("jdbc/oracle");
			
		} catch (NamingException e) {
			//e.printStackTrace();
			throw new Myexception ("ConnectionPoolError");
		}	 
	}//END MemberDAO()

	public String login(String id, String pw) throws Myexception {
		Connection con = null;
		PreparedStatement stmt = null;;
		ResultSet rs = null;
		try {
			con = dbcp.getConnection();
			stmt = con.prepareStatement("select MEMNAME from MEMBER where MEMID = ? and PW = ?");
			stmt.setString(1, id);
			stmt.setString(2, pw);			
			rs = stmt.executeQuery();
			if (rs.next()) {
				String name = rs.getString("memname");
				return name;
			} return null;
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new Myexception("로그인 실패");
		} finally {
			try {
				if (rs != null) {rs.close();}
				if (stmt != null) {stmt.close();}
				if (con != null) {con.close();}
			} catch (SQLException e) {
			}
		}
	}//END login(id, pw)
	
	
}//END CLASS
