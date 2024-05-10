package mine;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산을 입력하세요: ");
		String cal = scanner.next();
		System.out.print("피연산자 2개를 입력하세요: ");
		for (int i = 0; i < 2; i++) {
			int i1 = scanner.nextInt();
		}
		
		if (cal=="+") {
			System.out.println(a+"+"+b+"="+(a+b));
		}
			
		
	}
}
