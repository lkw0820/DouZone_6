package kosa.video;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VideoMain {
	public void examfit(List<GeneralMember> list){
		//list를 스트림으로 인천사람만 필터링 해서 출력
		list.stream()
				.filter(m -> m.getAddress().equals("인천"))
				.forEach(m->System.out.println(m.getId()));
		List<GeneralMember> incheon = list.stream()
				.filter(m -> m.getAddress().equals("인천"))
				.collect(Collectors.toList());
		
		//return stream;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v = new Video(3,"존윅4","키아누 리부스");
		Video v2 = new Video(5,"탑건2","톰크루즈");
		Video v3 = new Video(6,"가오겔3","그루트");
		GeneralMember p = new GeneralMember();
		GeneralMember p2 = new GeneralMember();
		GeneralMember p3 = new GeneralMember("ccc","이기원2","인천",v);
		GeneralMember p4 = new GeneralMember("ddd","dllrl2", "dlscjs", 4, "ㅁㅇㄹ", "ㅁㅇㄹㅇㄻㅇㄹㅇㄹ");
		GeneralMember p5 = new GeneralMember("eee","이기원5","혜화");
		//p5.rental(v2);
		
		GeneralMember p6 = new GeneralMember("fff","이기원6","서울",2);
		p6.rental2(v);
		p6.rental2(v2);
		//p6.show2();
		
		GeneralMember p7 = new GeneralMember("fff","이기원7","서울");
		//p7.rental3(v);
		//p7.rental3(v2);
		//p7.show3();
		
		SpecialMember sp = new SpecialMember("ggg","이기원8","인천",10);
//		sp.rental(v);
//		sp.rental(v3);
//		sp.show();
		
		GeneralMember[] arr = new GeneralMember[3];
		arr[0]=p5;//일반
		arr[1]=p7;//일반
		arr[2]=sp;//스페셜
		for(int i=0;i<arr.length;i++) {
			arr[i].rental(v3);
			if(arr[i] instanceof SpecialMember) {
				arr[i].rental(v);
			}
			arr[i].show();
		}
		List<GeneralMember> list = Arrays.asList(
				new GeneralMember(),
				new GeneralMember("ccc","이기원2","인천",v),
				new GeneralMember("ddd","dllrl2", "dlscjs", 4, "ㅁㅇㄹ", "ㅁㅇㄹㅇㄻㅇㄹㅇㄹ"),
				new GeneralMember("eee","이기원5","혜화"),
				new GeneralMember("fff","이기원6","서울",2),
				new GeneralMember("fff","이기원7","서울"),
				new SpecialMember("ggg","이기원8","인천",10)
				);
		
//		p.id="aaa";
//		p.name="홍길동";
//		p.address="동탄";
//		p.vo.no=1;
//		p.vo.name="트렌스포머3";
//		p.vo.actor="서봉수";
//		p.info();
//		System.out.println();
//		
//		p2.id="bbb";
//		p2.name="이기원";
//		p2.address="인천";
//		p2.vo.no=2;
//		p2.vo.name="마리오";
//		p2.vo.actor="키노키오";
//		p2.info();
//		
//		System.out.println();
//		p3.info();
//		System.out.println();
//		p4.info();
//		System.out.println();
//		p5.show();


	}

}
