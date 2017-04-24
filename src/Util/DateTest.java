package Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now=new Date();
		System.out.println(now);
		printDate(now);
		
		printDate2(now);
		
		//특정 시간 세팅(2000/04/21)
		Date d2 = new Date(100, 3, 21);
		printDate(d2);
		
		//특정 시간 세팅(2000/04/21 13:25:30)
		//생성자에 따라 들어가는 값이 다르지만 시간만 세팅하는 생성자는 없다.
		Date d3 = new Date(100, 3, 21,13,25,30);
		printDate(d3);
		
		//1970년 1월 1일 00:00:00.000
		//milliseconds 값을 세팅
		
		long miliseconds = 24L*60*60*1000*365*30; //(24*60*60*1000)하루의 밀리세턴즈의 양
		
		Date d4=new Date(miliseconds);
		printDate(d4);
		

	}
	
	public static void printDate(Date date)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf1.format(date));
	}
	
	
	public static void printDate2(Date d)
	{
		//년도 +1900
		int year=d.getYear(); //나중에 없어질거니깐 다른거 써라.
		System.out.println((year+1900)+"년");
		
		//월(0~11)
		int month=d.getMonth();
		System.out.println((month+1)+"월");
		
		//일
		int date=d.getDate();
		System.out.println(date+"일");
		
		//시
		int hour=d.getHours();
		System.out.println(hour+"시");
		
		//시
		int minutes=d.getMinutes();
		System.out.println(minutes+"분");
	}

}
