package question04;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for (int i =1 ; i > a; i++) {
			for (int j = a; j < 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
			scanner.close();
		}
	}
}
