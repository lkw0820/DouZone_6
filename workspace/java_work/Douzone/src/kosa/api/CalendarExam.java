package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc1 = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		System.out.println(gc);
		System.out.println(gc1);
		
		String now = gc.get(Calendar.YEAR)+"년"
				+(gc.get(Calendar.MONTH)+1)+"월"
				+gc.get(Calendar.DATE)+"일"
				+gc.get(Calendar.HOUR)+"시"
				+gc.get(Calendar.MINUTE)+"분";
		System.out.println(now);
		
		gc.add(Calendar.DATE, 100);
		String future = gc.get(Calendar.YEAR)+"년"
				+(gc.get(Calendar.MONTH)+1)+"월"
				+gc.get(Calendar.DATE)+"일"
				+gc.get(Calendar.HOUR)+"시"
				+gc.get(Calendar.MINUTE)+"분";
		System.out.println("100일후: "+future);
		gc.set(2022, 11, 24);
		gc.add(Calendar.DATE,200);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//Calendar객체를 Date로 형변환 -> getTime
		String str = sdf.format(gc.getTime());
		System.out.println(str);
		
		//2023~2030년 까지 자신의 생일 무슨요일
		char week[] = {'일','월','화','수','목','금','토'};	
		
		for(int i=2023;i<=2030;i++) {
			gc.set(i, 7, 20);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];//DAY_OF_WEEK은 1부터 시작
			System.out.println(i+"년의 생일은 "+c+"요일 입니다");
		}
	}

}