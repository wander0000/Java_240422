package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>> ");
		Scanner s = new Scanner(System.in);
		
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
//	평균값은 median이라고 정수값으로 하나 받아놓음
		int median=0;
		
		if ((a>b) && (b>c) || (c>b)&&(b>a)) {
			median=b;
		} else if ((b>a) && (a>c) || ((c>a)&&(a)>b)) {
			median=a;
		} else {
			median=c;
		}
			System.out.println("중간값은 " +median);
			
//			System.out.println("중간값은 " +b);
//			System.out.println("중간값은 " +a);
//			System.out.println("중간값은 " +c);
		
		s.close();
	}

}
