package question07;

import java.util.Scanner;

public class ComputerInterestTrue {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double rate,blance;//연이율, 원리금(잔액)  
		int principal;//원금
		int years=0;
		
		System.out.print("원금을 입력하시오>> ");
		principal = scanner.nextInt();
		System.out.print("연이율을 입력하시오>> ");
		rate = scanner.nextDouble();
		blance = principal;
		System.out.println("\t연도수\t원리금");
		do {
			years++;
			blance =blance*(1.0+(rate/100.0));
			System.out.println(years+"\t"+blance);
			
		} while (blance > 2.0*principal);
		System.out.println("\n필요한 연도수 = "+years); 
		scanner.close();
	}
}
