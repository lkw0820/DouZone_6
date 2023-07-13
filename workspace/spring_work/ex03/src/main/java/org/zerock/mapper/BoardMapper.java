package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();
	public int insertBoard(BoardVO board);
	public int insertBoardSelectKey(BoardVO board);
	public BoardVO selectBoard(Long bno);
	public int updateBoard(BoardVO board);
	public int deleteBoard(Long bno);
}
