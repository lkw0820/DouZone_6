package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<Integer>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		System.out.println("stack");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println("queue");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
