package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		
		System.out.print("매수 수량을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		final int PRICE = 520;
		
		int total = num * PRICE;
		int hundred = total/100;
		int ten= total%100;
		int tendollar=ten/10;
		
		if (tendollar != 0) {
			System.out.println("100달러짜리"+hundred+"개");
			System.out.println("10달러짜리"+tendollar+"개");
		} else {
			System.out.println("100달러짜리"+hundred+"개");
		}		
		scanner.close();
		
	}
}
