package kosa.di;

public class WriteService implements Service {
	private Dao dao;
	
	public WriteService() {
		super();
	}
	public WriteService(Dao dao) {
		super();
		this.dao = dao;
	}

	public void insertSerivce() {
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
