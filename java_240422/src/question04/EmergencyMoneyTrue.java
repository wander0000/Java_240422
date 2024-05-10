package question04;

import java.util.Scanner;

public class EmergencyMoneyTrue {
	public static void main(String[] args) {
//		상수로 100달러,10달러 원화 계산
		final int HUNDRED = 120000;
		final int TEN = 12000;
		int res, money, num;
		
		
		System.out.print("가구수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		
		if (num ==1) {
			money = 400000;
		} else if (num ==2) {
			money = 600000;
		} else if (num ==3) {
			money = 800000;
		} else {
			money = 1000000;
		}
		
		res=money/HUNDRED;
//		100달러 짜리 1개 이상일 때
		if (res >0) {
			System.out.println("100달러짜리"+res+"개");
		} 
		
//		나머지 돈을 다시 셋팅
		money = money%HUNDRED;
		
		res=money/TEN;
//		100달러 짜리 1개 이상일 때
		if (res >0) {
			System.out.println("10달러짜리"+res+"개");
		} 
		
		scanner.close();
	}
}
