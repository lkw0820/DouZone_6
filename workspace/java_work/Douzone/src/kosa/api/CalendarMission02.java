package kosa.api;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CalendarMission02 {

	public static void main(String[] args) {
		// 2023 5월 달력 만들기
		//<2023년 5월>
		// 일	월	화	수	목	금	토
		//		1	2	3	4	5	6
			
				
		Calendar gc = Calendar.getInstance();
		int start = gc.getActualMinimum(Calendar.DATE);//시작 0부터
		int end = gc.getActualMaximum(Calendar.DATE); //끝
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=start;i<=end;i++) {
			arr.add(i);
		}
		System.out.println("<2023년 5월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//char week[] = {'일','월','화','수','목','금','토'};	

		//char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
		
//		System.out.println(gc.get(Calendar.DAY_OF_WEEK)); //1부터
//		
//		System.out.println(start);
		switch (start) {
		case 7:
			arr.add(0,0);
			//break;
		case 6:
			arr.add(0,0);
			//break;
		case 5:
			arr.add(0,0);
			//break;
		case 4:
			arr.add(0,0);
			//break;
		case 3:
			arr.add(0,0);
			//break;
		case 2:
			arr.add(0,0);
			//break;
		case 1:
			arr.add(0,0);
			//break;
		case 0:
			
			break;
		}
//		System.out.print("\t");

//		for(int i = start;i<=end;i++) {
//			
//			System.out.print(i+"\t");
//			if(i%7==0) {
//				System.out.println();
//			}
//		}
		int i=1;
		for(int num : arr) {
			if(num==0) {
				System.out.print("\t");
			}else {
				System.out.print(num);
				System.out.print("\t");
			}
			
			
			if(i%7==0) {
				System.out.println();
			}
			i++;
		}
		
			

	}

}
