package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		int money = scanner.nextInt();
		
		int fiftythousand = money/50000;
		if (fiftythousand > 0) {
			System.out.println("오만원권 "+fiftythousand+"매");
		}	
		int res = money%50000;
		int tenthousand = res/10000;
		if (tenthousand > 0) {
			System.out.println("만원권 "+tenthousand+"매");
			res = res%10000; 
		}
		int thousand = res/1000;
		res = res%1000;
		if (thousand > 0) {
			System.out.println("천원권 "+thousand+"매");
		}
		int fivehundred = res/500;
		res = res%500;
		if (fivehundred > 0) {
			System.out.println("오백원 "+fivehundred+"개");
		}
		int hundred = res/100;
		res = res%100;
		if (hundred > 0) {
			System.out.println("백원 "+hundred+"개");
		}
		int fifty = res/50;
		res = res%50;
		if (fifty > 0) {
			System.out.println("오십원 "+fifty+"개");
		}
		int ten = res/10;
		int one = res%10;
		if (ten > 0) {
			System.out.println("십원 "+ten+"개");
			System.out.println("일원 "+one+"개");
		}
		scanner.close();
	}
}
