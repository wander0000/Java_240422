package question04;

import java.util.Scanner;

public class ChangeMoneyTrue {
	public static void main(String[] args) {
		
		final int 오만원=50000;
		final int 만원=10000;
		final int 천원=1000;
		final int 오백원=500;
		final int 백원=100;
		final int 오십원=50;
		final int 십원=10;
		final int 일원=1;
	    int res, money;
	    
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		money = scanner.nextInt();
		
		
		res= money/오만원;
		if (res > 0) {
			System.out.println("오만원권 "+오만원+"매");
		}	
		money = money%오만원;
		res = money/만원;
		if (res > 0) {
			System.out.println("만원 "+만원+"매");
		}	
		money = money%만원;
		res = money/천원;
		if (res > 0) {
			System.out.println("천원 "+천원+"매");
		}	
		money = money%천원;
		res = money/오백원;
		if (res > 0) {
			System.out.println("오백원 "+오백원+"매");
		}	
		money = money%오백원;
		res = money/백원;
		if (res > 0) {
			System.out.println("백원 "+백원+"매");
		}	
		money = money%백원;
		res = money/십원;
		if (res > 0) {
			System.out.println("십원 "+십원+"매");
		}	
		money = money%십원;
		res = money/일원;
		if (res > 0) {
			System.out.println("일원 "+일원+"매");
		}	
		scanner.close();
	}
}
