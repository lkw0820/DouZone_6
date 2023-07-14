package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	public List<BoardVO> getList();
	public List<BoardVO> getListWithPaging(Criteria cri);
	public int getTotalCount(Criteria cri);
	public int insertBoard(BoardVO board);
	public int insertBoardSelectKey(BoardVO board);
	public BoardVO selectBoard(Long bno);
	public int updateBoard(BoardVO board);
	public int deleteBoard(Long bno);
}
