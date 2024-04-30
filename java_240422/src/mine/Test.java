package mine;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int x = 0;
		System.out.println(x);
		System.out.println("정수 2개를 입력하세요>>");
		Scanner s = new Scanner(System.in);
		x= s.nextInt();
		x= s.nextInt();
		boolean a = true, b= false, c=true;
		a=(b||c) &&(a ||false);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		s.close();
	}
}
