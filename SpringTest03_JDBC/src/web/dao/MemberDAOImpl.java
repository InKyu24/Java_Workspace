package web.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import web.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	// 설정 파일에서 생성한 dataSource 빈을 setter를 이용해 JdbcTemplate 클래스 생성자의 인자로 입력한다.
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<MemberVO> selectAllmembers() {
		//db
		String sql = "SELECT * from member order by memdate desc";
		// JdbcTemplate 클래스의 query() 메서드 인자로 select문을 전달해 조회한 레코드의 개수만큼 MemberVO 객체를 생성한다.
		// 각 레코드의 값을 속성에 저장하고 다시 memberList에서 저장한다.
		List<MemberVO> list = jdbcTemplate.query(sql,new RowMapper<MemberVO>() {
			public MemberVO mapRow (ResultSet rs, int rowNum) throws SQLException {
				String id = rs.getString("memid");
				String name = rs.getString("memname");
				Date date = rs.getDate("memdate");
				String pw = rs.getString("pw");
				MemberVO m = new MemberVO(id,pw,name,date);
				System.out.println(rowNum+":"+m);
				return m;
			}
		});
		return list;
		
	}

}
