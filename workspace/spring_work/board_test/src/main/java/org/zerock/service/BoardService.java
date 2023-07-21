package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	public List<BoardVO> getList();
	public void register(BoardVO vo);
	public BoardVO read(Long bno);
	public int remove(Long bno);
	public int modify(BoardVO vo);
	public List<BoardVO> getList(Criteria cri);
	public int getTotalCnt();
}
