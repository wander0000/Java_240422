package question06;

import java.util.Iterator;
import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		char alphabet[] = {'a','b','c','d','e','f','g','h','i'
							,'j','k','l','m','n','o','p','q','r'
							,'s','t','u','v','w','x','y','z'};
//		char c;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c= s.charAt(0);
//		int num = (int) c;
		
			for (int i = 0; i < alphabet.length; i++) {
				if (alphabet[i] == c) {
					System.out.println(i);
					System.out.println(alphabet[i]);
					for (int j2 = 0; j2 <= i; j2++) {
						for (int j = i; j >= 0; j--) {
							System.out.print(alphabet[j]);
						}System.out.println();
					}
				}
			}
			
	}

}
		
//		System.out.println(c);
//		
//		for (int i = 0; i < args.length; i++) {
//			
//		}
