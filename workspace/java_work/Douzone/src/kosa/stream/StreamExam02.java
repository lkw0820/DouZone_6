package kosa.stream;

import java.util.stream.IntStream;

public class StreamExam02 {
	public static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//range() 끝수 포함X rangeClosed() 끝수 포함
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum+=a);
		System.out.println(sum);

	}

}
