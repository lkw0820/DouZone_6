package kosa.thread;

public class SumThread extends Thread {
	private int start;
	private int end;
	private int total;

	public SumThread() {
		super();
	}
	

	public SumThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start;i<=end;i++)
			total+=i;
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}
	

}
