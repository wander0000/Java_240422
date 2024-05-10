package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		System.out.print("매수금액을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int purchaxeAmount = scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int saleAmount = scanner.nextInt();
		double transferTex;
		
		if (purchaxeAmount < saleAmount) {
			transferTex =(saleAmount-purchaxeAmount)*0.22;
		} else {
			transferTex = 0.0;
		}
		
		System.out.print("양도세: "+transferTex);
		scanner.close();
		
	}
}
