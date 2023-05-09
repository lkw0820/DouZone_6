package kosa.video;

public class SpecialMember extends GeneralMember {
	private int bonus;

	//생성자
	public SpecialMember() {
		super();
	}

//	public SpecialMember(int bonus) {
//		super();
//		this.bonus = bonus;
//	}
	
	
	public SpecialMember(String id, String name, String address, int bonus) {
		super(id, name, address);
		this.bonus = bonus;
	}

	//method
//	public void show() { 
//		super.show();
//		System.out.println("회원의 보너스 포인터 적립: "+ bonus);
//	}
//	
//	public void rental(Video video) {
//		super.rental(video);
//		this.bonus+=10;
//	}

	@Override
	public void rental(Video video) {
		// TODO Auto-generated method stub
		super.rental(video);
		this.bonus+=100;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("회원의 보너스 포인터 적립: "+ bonus);
	}
	//getter setter
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
