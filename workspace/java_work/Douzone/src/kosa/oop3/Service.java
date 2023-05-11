package kosa.oop3;

public class Service {
	
	private Sql sql;
	//생성자
	public Service() {
		super();
	}

	public Service(Sql sql) {
		super();
		this.sql = sql;
	}
	
	
	//method
	public void insert() {
		sql.intsert();
	}

	
	//get set
	public Sql getSql() {
		return sql;
	}

	public void setSql(Sql sql) {
		this.sql = sql;
	}
	
	

}
