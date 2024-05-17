package question07;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] unit = {50000,10000,1000,500,100,50,10,1};
		int[] bill= new int[8];
		System.out.print("금액을 입력하시오>> ");
		int money = scanner.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			if (money/unit[i] != 0) { 
				bill[i]=money/unit[i];
				money = money%unit[i];
				System.out.println(unit[i]+"원 짜리 : "+ bill[i]+"개");
			}
		}
		scanner.close();
	}
}
