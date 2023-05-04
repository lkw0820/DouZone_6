package kosa.oop;

public class BoradMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board[] b = {
				new Board(),
				new Board(),
				new Board(),
				new Board()
		};
		for(int i=0;i<b.length;i++) {
			b[i].info();
		}
		for(Board board : b) {
			board.info();
		}
	}

}
