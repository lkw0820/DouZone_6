package kosa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMission {

	public static void main(String[] args) {
		//1~10까지 리스트에 담아서 Stream을 이용해서 출력
		List<Integer> list = Arrays.asList(
				1,
				2,
				3,
				4,
				5,
				6,
				7,
				8,
				9,
				10
				);
		Stream<Integer> stream = list.stream(); 
		//stream.forEach(n -> System.out.println(n));
		stream.forEach(System.out::println);
		IntStream stream4 = IntStream.rangeClosed(1, 10);
		stream4.forEach(n -> System.out.println(n));
				
		
		//문자열 배열을 List으로 변환 후 Stream을 이용해서 출력
		String str ="hello";
		String[] arr = str.split("");
		List<String> list2 = Arrays.asList(arr);
		//문자열 배열을 바로 스트림으로 변환
//		Stream<String> stream3 = Arrays.stream(arr);
//		stream3.forEach(s -> System.out.println(s));
		
		Stream<String> stream2 = list2.stream();
		stream2.sorted().forEach(s -> System.out.println(s));
		//stream2;

	}

}
