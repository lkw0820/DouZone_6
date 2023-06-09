package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동",28));
		list.add(new Person("심길동",21));
		list.add(new Person("림길동",37));
		list.add(new Person("김길동",30));
		list.add(new Person("빔길동",52));
		list.add(new Person("딤길동",60));
		list.add(new Person("님길동",24));
		list.add(new Person("밈길동",10));
		List<Person> list1 = Arrays.asList(
				new Person("홍길동",28),
				new Person("심길동",21),
				new Person("림길동",37),
				new Person("김길동",30),
				new Person("빔길동",52),
				new Person("딤길동",60),
				new Person("님길동",24),
				new Person("밈길동",10)
				);
		Stream<Person> stream=list1.stream();
		IntStream instream = stream.mapToInt(p -> p.getAge());
		double avg = instream.average().getAsDouble();
		System.out.println(avg);
		double avg2 = list1.stream()
				.mapToInt(p->p.getAge())
				.average()
				.getAsDouble();
		System.out.println(avg2);
		//디폴트값 설정
		double avg3 = list1.stream()
				.mapToInt(p->p.getAge())
				.average()
				.orElse(0.0);
		//리스트로 변환
		List<Person> oldPeople = list1.stream()
				.filter(s->s.getAge()>35)
				.collect(
						Collectors.toList());
		System.out.println("List");
		System.out.println(oldPeople);
		//map으로 변환
		Map<String,Integer> map = list1.stream()
				.filter(s->s.getAge()<35)
				.collect(Collectors.toMap(
						s->s.getName(), 
						s->s.getAge()
				)
		);
		System.out.println("Map");
		System.out.println(map);
				
		
		
		Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				//String : 앞.comparaTo(뒤)
				//0=>앞(AAA) == 뒤(AAA)
				//-1=>앞(AAA) < 뒤(ABB)
				//1=>앞(AAB) > 뒤(AAA)
				if(o1.getName().compareTo(o2.getName())>0) {
					return 1;
				}else if(o1.getName().compareTo(o2.getName())<=0) {
					return -1;
				}
				return 0;
			}
			});
		System.out.println(list);
	}
	
}
