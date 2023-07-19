package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.ReplyMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
@Service
@Log4j
public class ReplyServiceImpl implements ReplyService {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	@Transactional
	@Override
	public int register(ReplyVO vo) {
		// insert
		log.info("register...."+vo);
		//댓글수 추가
		boardMapper.updateReplyCnt(vo.getBno(), 1);
		return mapper.insert(vo);
	}

	@Override
	public ReplyVO get(Long rno) {
		// read
		log.info("get......."+rno);
		return mapper.read(rno);
	}

	@Override
	public int modify(ReplyVO vo) {
		// 수정
		log.info("get...."+vo);
		
		return mapper.update(vo);
	}

	@Transactional
	@Override
	public int remov(Long rno) {
		// 삭제
		log.info("remove....."+rno);
		ReplyVO vo = mapper.read(rno);
		//댓글 수 삭제
		boardMapper.updateReplyCnt(vo.getBno(), -1);
		return mapper.delete(rno);
	}

	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		// 목록 불러오기
		log.info("get Reply List of a Board "+ bno);
		return mapper.getListWithPaging(cri, bno);
	}

}
