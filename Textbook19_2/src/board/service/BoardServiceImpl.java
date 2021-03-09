package board.service;

import java.util.List;

import board.model.BoardDAOImpl;
import board.util.ArticleVO;

public class BoardServiceImpl {
	BoardDAOImpl boardDAO;
	public void BoardService() {
		boardDAO = new BoardDAOImpl(); // 인터페이스를 이용해 하위 클래스 객체를 생성한 후 데이터베이스와 연동한다.
	}

	public List<ArticleVO> listArticles() {
		List<ArticleVO> articlesList = boardDAO.selectAllArticles();
		return articlesList;
	}
}
