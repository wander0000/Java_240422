package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
//		final double RATE1=1200;
//		final double RATE2=1500;
		final double DOLLAR_RATE=1200;
		final double EURO_RATE=1500;
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
//		double dollar = won/RATE1;
//		double euro = won/RATE2;
		double dollar = won/DOLLAR_RATE;
		double euro = won/EURO_RATE;
		
		System.out.println(won+"원은"+"$"+dollar+"입니다.");
		System.out.println(won+"원은"+"E"+euro+"입니다.");
		
		scan.close();
		
	}

}
