package chapter06;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//컴퓨터에서는 달을 0~11로 연산
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);//오전:0,오후:1
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);//1000분의 1초
		
		System.out.print(msg+":"+year+"-"+month+"-"+day+" ");//현재:2024-5-18
//		System.out.println(dayofWeek);//6 (일요일 1, 월요일 2, 화요일 3 ...)
//		System.out.println(Calendar.FRIDAY);//6 (금요일)
		
		switch (dayofWeek) {
		case Calendar.SUNDAY : System.out.print("일요일"); break;
			case Calendar.MONDAY : System.out.print("월요일"); break;
			case Calendar.TUESDAY : System.out.print("화요일"); break;
			case Calendar.WEDNESDAY : System.out.print("수요일"); break;
			case Calendar.THURSDAY : System.out.print("목요일"); break;
			case Calendar.FRIDAY : System.out.print("금요일"); break;
			case Calendar.SATURDAY : System.out.print("토요일"); break;
			default: break;
		}
		
		System.out.print("("+hourOfDay+")");//24시간 기준
		if (ampm== Calendar.AM) {
			System.out.print("오전 ");
		} else {
			System.out.print("오후 ");
		}
		System.out.println(hour+"시 "+minute+"분 "+second+"초 "+millisecond+"밀리초");
		}
	public static void main(String[] args) {
//		abstract class(추상클래스)는 new 연산자로 객체생성 불가
		Calendar now = Calendar.getInstance();
		printCalendar("현재", now);
		Calendar firstDate = Calendar.getInstance();
		firstDate.clear();
		firstDate.set(2016,11,25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		printCalendar("처음 데이트한 날은 ", firstDate);
	}
}
