package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExam {

	public static void main(String[] args) {
		// Map: (key,value),(key,value)..=> HashMap
		Map<String,String> map = 
				new TreeMap<String, String>();
		
		map.put("1","SSG");
		
		map.put("5","이기원");
		map.put("3","LG");
		map.put("2","키움");
		map.put("0","이기원2");
		System.out.println(map);
		
		System.out.println("요소의 사이즈: "+map.size());
		
//		if(map.containsValue("SSG")) {
//			map.remove("1");
//		}
		System.out.println("요소의 사이즈: "+map.size());
		
		//Map의 전체 목록 출력(Key, Value):key를 모를때
		//Map => Set => Iterator
		//key=>keySet
		//value=>values() : Collection
		//(key,value) => entrySet();
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();
			System.out.println("key: "+e.getKey()+" value: "+e.getValue());
		}
		
	}

}
