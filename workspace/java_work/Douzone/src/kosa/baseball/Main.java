package kosa.baseball;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.게임 시작 2.종료");
		System.out.print("선택: ");
		String menu= DataInput.sc.nextLine();
		switch (menu) {
		case "1":
			Question q = new Question();
			Answer a = new Answer();
			//정답
			System.out.print("정답: ");
			int[] arr = q.getArr();
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			while(true) {
				a.input();
				if(a.check(q.getArr())) {
					return;
				}
			}
		case "2":
			System.out.println("종료");
			return;

		}
		
	}

}
