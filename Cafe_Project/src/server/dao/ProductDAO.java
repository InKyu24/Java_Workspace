package server.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.entity.ProductDTO;
import common.util.CafeException;

public class ProductDAO {
	
	public ProductDAO() throws CafeException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		
		} catch (ClassNotFoundException e) {
			throw new CafeException("오라클 드라이버 등록 실패");
		}
	}
	
	public void insertProduct(ProductDTO p) throws CafeException {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			stmt = con.prepareStatement("insert into Product values (?,?,?)");
			stmt.setString(1, p.getProdCode());
			stmt.setString(2, p.getProdName());
			stmt.setInt(3, p.getPrice());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new CafeException("상품 등록 실패");
		} finally {
			try {
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<ProductDTO> selectProduct() throws CafeException {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			stmt = con.prepareStatement("select * from product");
			ResultSet rs = stmt.executeQuery();
			ArrayList<ProductDTO> list = new ArrayList<ProductDTO>();
			while (rs.next()) {
				String prodCode = rs.getString(1);
				String prodName = rs.getString(2);
				int price = rs.getInt(3);
				ProductDTO p = new ProductDTO(prodCode, prodName, price);
				list.add(p);
			}
			return list;
		} catch (SQLException e) {
			throw new CafeException("상품 조회 실패");
		} finally {
			try {
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateProduct(ProductDTO p) throws CafeException {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			stmt = con.prepareStatement("Update product SET ProdName=?, price=? WHERE ProdCode=?");
			stmt.setString(1, p.getProdName());
			stmt.setInt(2, p.getPrice());
			stmt.setString(3, p.getProdCode());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new CafeException("제품 수정 실패");
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public void deleteProduct(ProductDTO p) throws CafeException {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAFE", "1313");
			stmt = con.prepareStatement("Delete from product WHERE ProdCode=?");
			stmt.setString(1, p.getProdCode());
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new CafeException("제품 삭제 실패");
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public String selectProduct(String prodCode) throws CafeException {
		Connection con=null;
		PreparedStatement stmt=null;
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CAFE","1313");
			stmt = con.prepareStatement("select prodName from product where prodCode=?");
			stmt.setString(1, prodCode);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				return rs.getString(1);
			} else {
				return null;
			}
		} catch (SQLException e) {
			throw new CafeException("상품 조회 실패");
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
