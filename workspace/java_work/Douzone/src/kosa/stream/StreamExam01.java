package kosa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(
				new Student("홍길동",50),
				new Student("박길동",100),
				new Student("김길동",57),
				new Student("이길동",85),
				new Student("기길동",66),
				new Student("황길동",77),
				new Student("홍길동",63),
				new Student("자길동",90),
				new Student("나길동",89),
				new Student("홍길동",41),
				new Student("최길동",77),
				new Student("강길동",65)
				);
		//방법1
//		Stream<Student> studentStream = list.stream();
//		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//		double avg = scoreStream.average().getAsDouble();
		
		
		
		//방법2
		double avg = list.stream()
				.mapToInt(student ->student.getScore())
				.average()
//				.getAsDouble()
				.orElse(0.0);
		System.out.println("평균점수: "+ avg);
		
//		list.stream()
//		//.distint()
//		.filter(p -> p.getScore()>60)
//		.forEach(p -> System.out.println(p.getScore()));
		
//		list.stream()
//		.mapToInt(p->p.getScore())
//		.filter(p->p>80)
//		.forEach(System.out::println);
		list.stream()
		.mapToInt(p->p.getScore())
		.filter(p->p>70)
		.sorted()
		.forEach(System.out::println);
		Map<Integer,String> map = list.stream()
				.filter(p ->p.getName().startsWith("홍"))
				.collect(
						Collectors.toMap(
								s->s.getScore(), 
								s->s.getName()
						)
				);
		//.forEach(p->System.out.println(p.getName()+p.getScore()));
		System.out.println(map);
		list.stream()
		.map(p->p.getName())
		.collect(
				Collectors.toList());
		List<Student> honglist=list.stream()
		.filter(s->s.getName().equals("홍길동"))
		.collect(
				Collectors.toList());
		System.out.println(honglist);
		
		list.stream()
		.map(Student::getName)
		.forEach(name -> System.out.println(name));
	}

}
