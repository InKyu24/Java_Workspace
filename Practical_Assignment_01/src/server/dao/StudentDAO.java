package server.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.dto.StudentDTO;
import common.util.AssignmentException;

public class StudentDAO {
	
	public StudentDAO() throws AssignmentException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new AssignmentException("오라클 드라이버 로딩 실패");
		}
	}

	public void insertStudent(StudentDTO studentDTO) throws AssignmentException {	
		// Student 테이블에 레코드가 insert 되도록!
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ASSIGNMENT","1313");
			stmt = con.prepareStatement("Insert Into student values (?,?,?,?,?)");
			stmt.setInt(1, studentDTO.getNo());
			stmt.setString(2, studentDTO.getName());
			stmt.setString(3, studentDTO.getDet());
			stmt.setString(4, studentDTO.getAddr());
			stmt.setString(5, studentDTO.getTel());
			int i = stmt.executeUpdate();
			
		} catch (SQLException e) {
			throw new AssignmentException("레코드 입력 실패");
		} finally {
			try {
				if (stmt!=null) stmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public void printAllStudents() throws AssignmentException {
		// Student 테이블에 모든 레코드가 조회되고 출력되도록!
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ASSIGNMENT","1313");
			stmt = con.prepareStatement("Select * From Student");
			rs = stmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("No");
				String name = rs.getString("name");
				String det = rs.getString("det");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				System.out.println(no+"\t"+name+"\t"+det+"\t"+addr+"\t"+tel);
			}
		} catch (SQLException e) {
			throw new AssignmentException("모든 레코드 조회 실패");
		} finally {
			try {
				if (stmt!=null) stmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
			}
		}
	}	
}

