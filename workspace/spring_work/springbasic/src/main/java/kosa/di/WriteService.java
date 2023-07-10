package kosa.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class WriteService implements Service {
	@Autowired
	//@Qualifier("mySQLDao")
	private Dao dao;
	
	public WriteService() {
		super();
	}
	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertService() {
		// TODO Auto-generated method stub
		dao.insertBoard();
		
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}

}
