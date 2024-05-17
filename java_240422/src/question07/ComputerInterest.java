package question07;

import java.util.Scanner;

public class ComputerInterest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double rate,blance;//연이율, 원리금(잔액)  
		int principal;//원금
		int years=0;
		
		System.out.print("원금을 입력하시오>> ");
		principal = scanner.nextInt();
		System.out.print("연이율을 입력하시오>> ");
		rate = scanner.nextDouble();
		
		System.out.println("연도수\t원리금");
		blance = (double) principal;
		while (true) {
			years += 1;
			blance =blance*(1.0+(rate/100.0));
			System.out.println(years+"\t"+blance);
			if (blance > 2.0*principal) break;
		}
		System.out.println("필요한 연도수 = "+years); 
		scanner.close();
	}
}
