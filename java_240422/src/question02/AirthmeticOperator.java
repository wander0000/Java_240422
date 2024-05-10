package question02;

import java.util.Scanner;

public class AirthmeticOperator {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		int time = scanner.nextInt();
		int hour = time / 3600 ;
		int minute = (time / 60) % 60 ;
		int second = time % 60;
				
		/*
		int totalSecond = scanner.nextInt();
		int second = totalSecond%60;
		int totalMinute = totalSecond/60;
		int minute = totalMinute%60;
		int hour=totalMinute/60;
		System.out.println(totalSecond+"초는 "+hour+"시간, "+minute+"분, "+second+"초입니다.");
		 */
		System.out.println(time+"초는 "+hour+"시간, "+minute+"분, "+second+"초입니다.");
		scanner.close();
	}
}
