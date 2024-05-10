package question03;

import java.util.Scanner;

public class TeslaTrue {
	public static void main(String[] args) {
		
		int tesla=520;
		int num;//수량
		int money;//tesla * num
		int res; //계산된 결과값
		
		System.out.print("매수 수량을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		money = tesla * num;
		
		res = money/100; //100달러를 계산
		
//		100달러 짜리가 1매 이상일 때
		if (res>0) {
			System.out.println("100달러짜리"+res+"개");
		}
		
//		money가지고 10달러를 계산
		
		res = (money%100)/10;
		
//		10달러 짜리가 1매 이상일 때
		if (res>0) {
			System.out.println("10달러짜리"+res+"개");
		}
				
		scanner.close();
		
	}
}
