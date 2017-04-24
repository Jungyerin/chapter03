package Util;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calendar cal = new Calendar(); //생성이 되지 않음 따로 만들어 주는 객체가 존재(싱글톤을
		// 유지해야하는 경우)
		// 따로 객체를 만들어주는 메소드가 존재 계속 new를 해주면 싱글톤 유지가 되지 않게때문에 메소드를이용해서
		// 객체를 생성

		Calendar cal = Calendar.getInstance();
		printDate(cal);
		
		//특정 날짜 세팅하기
		cal.set(Calendar.YEAR, 1993);
		cal.set(Calendar.MONTH, 02);
		cal.set(Calendar.DATE, 18);
		//cal.set(2007,10,12);
		printDate(cal);
		
		//기념일
		cal.add(Calendar.DATE, 10000);
		printDate(cal);

	}

	public static void printDate(Calendar cal) {
		String[] days={"일", "월", "화", "수","목","금","토"};
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		//0~11
		int date = cal.get(Calendar.DATE);
		//1(일)~7(토)
		int day=cal.get(Calendar.DAY_OF_WEEK);
		int am=cal.get(Calendar.AM_PM);
		int hour=cal.get(Calendar.HOUR);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		
		System.out.println(
				year+"년 "+
				(month+1)+"월 "+
				date+"일 "+
				days[day-1]+"요일 "+
				(am==0 ? "오전 ":"오후 ")+
				hour+":"+
				min+":"+
				sec);
	}

}
