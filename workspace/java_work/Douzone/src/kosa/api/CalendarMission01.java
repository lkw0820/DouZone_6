package kosa.api;

import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarMission01 {

	public static void main(String[] args) {
		// 키보드로 입력 과거의 입사일 입력하면  => 몇년 몇개월 재직 중
		Scanner sc = new Scanner(System.in);
		Calendar gc = Calendar.getInstance();
		Calendar gc1 = Calendar.getInstance();
		
		String pattern = "yyyy/MM/dd"; //예) 2022/01/01
		System.out.print("입사일 입력: ");
		String join = sc.nextLine();
		String[] arr = join.split("/");
		int[] date =new int[3];
		int i=0;
		for(String str : arr) {
			
			date[i]=Integer.parseInt(str);
			i++;
		}

		//입사 날짜 설정
		gc.set(date[0], date[1], date[2]);

		int year=gc1.get(Calendar.YEAR)-gc.get(Calendar.YEAR);
		int month=gc1.get(Calendar.MONTH)-gc.get(Calendar.MONTH)+1;
		int date1=gc1.get(Calendar.DATE)-gc.get(Calendar.DATE);
		System.out.println(year+"년 "+month+"개월 "+date1+"일 재직중입니다");

		
		
		
	}

}
