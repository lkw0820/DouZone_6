package kosa.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	public void insertBoard(Board board) {
		sqlTemplate.insert("kosa.mapper.BoardMapper.insertBoard",board);
	}
}
