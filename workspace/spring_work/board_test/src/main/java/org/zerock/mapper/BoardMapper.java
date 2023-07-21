package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	public void insertBoard(BoardVO vo);
	public int deleteBoard(Long bno);
	public int updateBoard(BoardVO vo);
	public BoardVO selectBoard(Long bno);
	public List<BoardVO> getListWithPaging(Criteria cri);
	public int getTotalCount();
}
