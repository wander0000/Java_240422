package question01;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
//		max, min 선언
		int max=0;
		int min=0;
//		max 구하기	
		if (a>b && a>c) {
			max=a;
		}else if(b>a && b>c) {
			max=b;
		}else {
			max=c;
		}
//		min 구하기
		if (a<b && a<c) {
			min=a;
		}else if(b<a && b<c) {
			min=b;
		}else {
			min=c;
		}
		
		System.out.println("최대값은 "+max);
		System.out.println("최소값은 "+min);
	
		
		scanner.close();
		
		
//		if(a>b && a>c && b>c) {
//			System.out.println("최대값은"+a);
//			System.out.println("최소값은"+c);
//		} else if (a>b && a>c && b<c) {
//			System.out.println("최대값은"+a);
//			System.out.println("최소값은"+b);
//		} else if (b>a && b>c && a>c) {
//			System.out.println("최대값은"+b);
//			System.out.println("최소값은"+c);
//		} else if (b>a && b>c && a<c) {
//			System.out.println("최대값은"+b);
//			System.out.println("최소값은"+a);
//		} else if (c>a && c>b && a>b) {
//			System.out.println("최대값은"+c);
//			System.out.println("최소값은"+b);
//		} else {
//			System.out.println("최대값은"+c);
//			System.out.println("최소값은"+a);
//		}
//		scanner.close();
	}
}
