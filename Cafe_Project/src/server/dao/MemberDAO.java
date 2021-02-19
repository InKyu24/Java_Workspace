package server.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.entity.MemberDTO;
import common.util.CafeException;

public class MemberDAO {
	
	public MemberDAO() throws CafeException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1		
		} catch (ClassNotFoundException e) {
			throw new CafeException("오라클 드라이버 등록 실패");
		} 
	}
	
	public void insertMember (MemberDTO m) throws CafeException {
		Connection con = null;
		PreparedStatement stmt = null;		
		try {
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313"); // 2
			stmt = con.prepareStatement("Insert into member values (?,?,?,?,?) "); // 3
			stmt.setString(1, m.getMemid());
			stmt.setString(2, m.getName());
			stmt.setDate(3, new Date(m.getmDate().getTime()));
			stmt.setString(4, m.getPhone());
			stmt.setInt(5, m.getPoint());
			
			int i=stmt.executeUpdate();
			System.out.println(i+"행이 insert되었습니다");
		} catch (SQLException e) { 
			throw new CafeException("회원 등록 실패");
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public ArrayList<MemberDTO> selectMember () throws CafeException {
		Connection con = null;
		PreparedStatement stmt = null;		
		try {
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313"); // 2
			stmt = con.prepareStatement("Select * from member"); // 3
			
			ResultSet rs = stmt.executeQuery();
			ArrayList<MemberDTO> list=new ArrayList<MemberDTO>();
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				Date mDate = rs.getDate(3);
				String phone = rs.getString(4);
				int point = rs.getInt(5);
				MemberDTO m = new MemberDTO(id, name, mDate, phone, point); 
				list.add(m);
			}
			int i=stmt.executeUpdate();
			System.out.println(i+"행이 조회되었습니다");
			return list;
		} catch (SQLException e) { 
			throw new CafeException("회원 조회 실패");
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
			}
		}
	} 
	
	//public void SelectMember
	//public void deleteMember
	//public void updateMember 
}
