package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수 한쌍 Map 
		//ex) 김자바:80, 박자바:90
		//1.시험 응시자만 출력
		//2.총점, 평균, 최고점수,최저 점수
		Map<String,Integer> map = new TreeMap<String, Integer>();
		//TreeMap : (key값인 이름)글자순으로 정렬되서 저장
		map.put("최자바", 78);
		map.put("김자바", 100);
		map.put("박자바", 80);
		map.put("이자바", 70);
		
		int i =0;
		String[] name = new String[map.size()];
		
		//key -> keySet은 Set리턴
		Set<String> set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String key = (String)iter.next();
			System.out.println(key);
			name[i]=key;
		}
		//value -> Collection<value의 타입>리턴
		int tot=0,avg=0,max=0,min=0;
		Collection<Integer> col = map.values();
		Iterator<Integer> iter1 = col.iterator();
		while(iter.hasNext()) {
			tot+=iter1.next();
		}
		for(int score : col) {
			tot+=score;
		}
		avg=tot/col.size();
		max=Collections.max(col);
		min=Collections.min(col);
		System.out.println("총점: "+tot+" 평균: "+avg+" 최고점수: "+max+" 최저점수: "+min );

	}

}
