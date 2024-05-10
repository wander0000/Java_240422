package question01;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>> ");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		
//		마지막 숫자가 0이면 삼각형 넓이
		if (c==0) {
			float triangle = (a+b)/2;
			System.out.println("삼각형의 넓이는 "+triangle);
		} else {
			float trapezium = (a+b)*c/2;
			System.out.println("사다리꼴의 넓이는 "+trapezium);
		}
//		if (c==0) {
//			System.out.println("삼각형의 넓이는 "+(double)((a*b)/2));
//		} else {
//			System.out.println("사다리꼴의 넓이는 "+(double)(((a+b)*c)/2));
//		}
		scan.close();
	}
}
