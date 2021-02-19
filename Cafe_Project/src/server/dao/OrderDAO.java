package server.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.entity.OrderDTO;
import common.util.CafeException;

public class OrderDAO {
	public OrderDAO() throws CafeException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new CafeException("드라이버 등록 실패");
		}
		
	}
	
	public int insertOrder(OrderDTO o) throws CafeException {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			stmt = con.prepareStatement("Insert into orders (orderDate, orderMethod, MemberID, ProdCode,Quantity) values (?,?,?,?,?) ");
			java.util.Date now = new java.util.Date();
			o.setOrderDate(now);
			stmt.setDate(1, new Date(now.getTime())); // time 맞는지 체크
			stmt.setString(2, o.getOrderMethod());
			stmt.setString(3, o.getMemberID());
			stmt.setString(4, o.getProdCode());
			stmt.setInt(5, o.getOrderQuan());
			int i = stmt.executeUpdate();
			int orderNo = selectOrder(o);
			return orderNo;
			
		} catch (SQLException e) {
			throw new CafeException("주문 실패");
		} finally {
			try {
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public int selectOrder(OrderDTO o) throws CafeException {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs=null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CAFE","1313");
			stmt = con.prepareStatement("select orderNo from orders where orderDate=? and MemberID=? and Prodcode=? and Quantity=? and orderMethod=?");
			stmt.setDate(1, new Date(o.getOrderDate().getTime()));
			stmt.setString(2, o.getMemberID());
			stmt.setString(3, o.getProdCode());
			stmt.setInt(4, o.getOrderQuan());
			stmt.setString(5, o.getOrderMethod());
			rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);					
			} else { 
				return 0;
			} 
		} catch (SQLException e) {
			throw new CafeException("주문 조회 실패");			
			} finally {
				try {
					if (stmt != null) stmt.close();
					if (con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}

