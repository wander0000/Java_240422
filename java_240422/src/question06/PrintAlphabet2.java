package question06;

import java.util.Scanner;

public class PrintAlphabet2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c= s.charAt(0);
		
//		a, ab,abc,abcd,abcde 출력
//			for (char i = 'a'; i <=c; i++) {
//				for (char j = 'a'; j <= i; j++) {
//					System.out.print(j);
//				}

			for (char i = c; i >='a'; i--) {
				for (char j = 'a'; j <= i; j++) {
					System.out.print(j);
				}
			System.out.println();
			}
	scanner.close();
	}
}
		
