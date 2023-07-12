package kosa.mapper;


import java.util.List;

import kosa.model.Blog;
import kosa.model.Board;
import kosa.model.Search;

public interface BoardMapper {
	int insertBoard(Board board);
	List<Board> listBoard(Search search);
	Board detailBoard(int seq);
	int deleteBoard(int seq);
	int updateBoard(Board board);
	public Blog selectBlog(int id);
}
