package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		System.out.print("가구수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
//		int dollar=1200;
		int total, emerg;
		
		
		if(num==1) {
			emerg = 400000;
		} else if (num==2 ) {
			emerg = 600000;
		} else if (num==3 ) {
			emerg = 800000;
		} else {
			emerg = 1000000;
		}
		
		total = emerg/1200;
		int hundred=total/100;
		int res=(total%100)/10;
		
		System.out.println("100달러짜리"+hundred+"개");
		if(res != 0) {
			System.out.println("10달러짜리"+res+"개");
		}
		scanner.close();
	}
}

