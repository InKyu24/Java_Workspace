package web.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import web.util.MemberVO;
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

	public void memberInsert(MemberVO mVo) throws Myexception {
		Connection con = null;
		PreparedStatement stmt = null;;

		try {
			con = dbcp.getConnection();
			stmt = con.prepareStatement("insert into member (memid, memname, pw) values (?,?,?)");
			stmt.setString(1, mVo.getId());
			stmt.setString(2, mVo.getName());
			stmt.setString(3, mVo.getPw());
			int i = stmt.executeUpdate();
			System.out.println(i+"행 업데이트");
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new Myexception("회원 가입 실패");
		} finally {
			try {
				if (stmt != null) {stmt.close();}
				if (con != null) {con.close();}
			} catch (SQLException e) {
			}
		}
	}//END INSERT(mVo)

	public List<MemberVO> memberList() throws Myexception {
		List<MemberVO> list = new ArrayList <MemberVO> ();
		Connection con = null;
		PreparedStatement stmt = null;;
		ResultSet rs = null;
		try {
			con = dbcp.getConnection();
			stmt = con.prepareStatement("select * from MEMBER");	
			rs = stmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("memid");
				String pw = rs.getString("pw");
				String name = rs.getString("memname");
				MemberVO m = new MemberVO(id, pw, name);
				list.add(m);
			} return list;
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new Myexception("회원 조회 실패");
		} finally {
			try {
				if (rs != null) {rs.close();}
				if (stmt != null) {stmt.close();}
				if (con != null) {con.close();}
			} catch (SQLException e) {
			}
		}
	}//END LIST()

	public int memberDelete(String id) throws Myexception {
		Connection con = null;
		PreparedStatement stmt = null;;
		try {
			con = dbcp.getConnection();
			stmt = con.prepareStatement("Delete from Member where memid=?");
			stmt.setString(1, id);
			int i = stmt.executeUpdate();
			System.out.println(i +"행 딜리트");
			return i;
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new Myexception("회원 삭제 실패");
		} finally {
			try {
				if (stmt != null) {stmt.close();}
				if (con != null) {con.close();}
			} catch (SQLException e) {
			}
		}
	}//END DELETE(id, pw)
	
}//END CLASS
