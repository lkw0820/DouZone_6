package kosa.api;

import java.util.Calendar;

public class CalendarMission2_solu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar gc = Calendar.getInstance();
		int n = gc.getActualMaximum(Calendar.DATE);
		gc.set(2023,4,1); //5월 1일
		int week = gc.get(Calendar.DAY_OF_WEEK);//1~7
		
		System.out.println("<2023년 5월>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1;i<week;i++) {
			System.out.print("\t");
		}
		for(int i =1;i<=n;i++) {
			System.out.print(i+"\t");
			if((week+i-1)%7==0) {
				System.out.println();
			}
		}
	}

}
