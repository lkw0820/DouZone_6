package kosa.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CaledarMission1_solu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜 입력 ex) 2022/01/01 :");
		Date inDate = null;
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			}catch(Exception e) {
				System.out.println("다시 입력");
			}
		}
		System.out.println("종료");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		//총일수
		long day = (today.getTimeInMillis()-cal.getTimeInMillis())/(24*60*60*1000);
		int m = (int)(day/30);
		int year = m/12;
		int month = m%12;
		
		System.out.println("재직기간: "+ year+"년 "+month+"개월 근속");
		

	}

}
