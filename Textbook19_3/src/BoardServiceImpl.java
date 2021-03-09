import java.util.List;


public class BoardServiceImpl implements BoardService{
	private BoardDAO boardDAO;
	
	
	public BoardServiceImpl(BoardDAO boardDAO) {
		this.boardDAO = boardDAO;
	}

	public List<ArticleVO> listArticles() {
		List<ArticleVO> articlesList = boardDAO.selectAllArticles();
		return articlesList;
	}

	public BoardDAO getBoardDAO() {
		return boardDAO;
	}

	public void setBoardDAO(BoardDAO boardDAO) {
		this.boardDAO = boardDAO; // setter를 이용해 컨테이너에서 생성된 BoardDAOImpl 객체를 주입
	}
}
