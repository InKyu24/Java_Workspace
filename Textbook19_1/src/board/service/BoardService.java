package board.service;

import java.util.List;

import board.model.BoardDAO;
import board.util.ArticleVO;

public class BoardService {
	BoardDAO boardDAO;
	public BoardService() {
		boardDAO = new BoardDAO(); // BoardDAO 객체를 코드에서 직접 생성해 데이터베이스와 연동한다.
	}

	public List<ArticleVO> listArticles() {
		List<ArticleVO> articlesList = boardDAO.selectAllArticles();
		return articlesList;
	}
}
