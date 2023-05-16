package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
