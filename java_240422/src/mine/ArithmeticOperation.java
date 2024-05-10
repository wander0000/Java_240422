package mine;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		int total = scanner.nextInt();
		System.out.print("상품가격: ");
		int price = scanner.nextInt();
		int tex = price/10;
		System.out.println("부가세: "+tex);
		int change = total-price;
		System.out.println("잔돈: "+change);
		
		scanner.close();
		
	}
}
