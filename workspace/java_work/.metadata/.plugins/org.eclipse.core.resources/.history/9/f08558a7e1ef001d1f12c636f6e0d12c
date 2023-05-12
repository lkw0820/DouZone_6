package kosa.baseball;

public class Answer {
	private int[] answer;
	private int cnt;
	private int b;
	private int s;



	public Answer() {
		answer=new int[3];
	}
	
	public void input() {
		for(int i=0;i<answer.length;i++) {
			System.out.print(i+1+" 째 수 입력: ");
			answer[i]= Integer.parseInt(DataInput.sc.nextLine());
		}
		System.out.println("정답 제출 완료");
	}
	
	public boolean check(int[] arr) {
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(answer[i]==arr[j]) {
					if(i==j) {
						s++;
					}else {
						b++;
					}
				}
			}
		}
		cnt++;
		if(s==3) {
			System.out.println("축하합니다 정답입니다");
			System.out.println(cnt+"번째 성공");
			return true;
		}else {
			System.out.println(s+"S"+b+"B");
			s=0;
			b=0;
			return false;
		}
	}

	public int[] getAnswer() {
		return answer;
	}

	public void setAnswer(int[] answer) {
		this.answer = answer;
	}
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}





}
