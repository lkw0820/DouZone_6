package kosa.model;

public class RegisterDao {
	private static RegisterDao dao = new RegisterDao();
	public static RegisterDao getInstance() {
		return dao;
	}
	public void insertRegister(Register register) {
		System.out.println(register);
	}
}
