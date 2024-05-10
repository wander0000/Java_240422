package question04;

import java.util.Scanner;

public class PrintAsteriskTrue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		
		int n = scanner.nextInt();
		
//		구구단 > 2중 for (행과 열 출력)
//		갯수를 행과 열 출력 > 2중 for 사용
		
		
//		*가 1개부터 입력한 숫자만큼 출력되는 코드
//		for (int i =0 ; i < n; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			scanner.close();
		
		for (int i =n ; i < 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			scanner.close();
		}
	}
}

