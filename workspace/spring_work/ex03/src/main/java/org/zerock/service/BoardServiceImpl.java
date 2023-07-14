package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;
	@Override
	public void register(BoardVO board) {
		// insert
		log.info("register..");
		mapper.insertBoardSelectKey(board);
	}

	@Override
	public BoardVO get(Long bno) {
		// select
		log.info("get()....");
		
		return mapper.selectBoard(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		// update
		
		if(mapper.updateBoard(board)>0) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean remove(Long bno) {
		// TODO Auto-generated method stub
		log.info("remove.....");
		if(mapper.deleteBoard(bno)>0) {
			return true;
		}else {
			return false;
		}
	}

//	@Override
//	public List<BoardVO> getList() {
//		// TODO Auto-generated method stub
//		return mapper.getList();
//	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("listpaging");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("total count");
		
		return mapper.getTotalCount(cri);
	}



}
