package kosa.baseball;

public class Question {
	private int[] arr = new int[3];
			
	//생성자
	public Question() {
		//arr[0]=(int)(Math.random()*9)+1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}

		}
		
	}
	
	//get set
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
}


