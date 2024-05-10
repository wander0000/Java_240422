package question01;

import java.util.Scanner;

public class SumMultiply {

	public static void main(String[] args) {
		System.out.print("2개의 정수 입력>> ");
		
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
//		int sum= a + b;
//		int multiply= a * b;
		
		
//		문자열+정수=문자열이 되므로 연산할 부분을 괄호로 먼저 묶어줘야 오류 안생김
		System.out.println("두수의 합은 "+(a+b));
		System.out.println("두수의 합은 "+(a*b));
		
		
//		System.out.println("두수의 합은 "+sum);
//		System.out.println("두수의 곱은 "+multiply);

		scanner.close();
	}

}
