package kosa.oop3;

public class MainSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySQLDao mysql = new MySQLDao();
		OracleDao oracle = new OracleDao();
		
		//Service serivce = new Service(oracle);
		
		Service service = new Service(new Sql() {
			
			@Override
			public void intsert() {
				// TODO Auto-generated method stub
				System.out.println("MSSQLDAO insert");
			}
		});
		
		//serivce.insert();
		service.insert();
	}
}