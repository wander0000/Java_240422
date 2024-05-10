package question01;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
//		System.out.println("반지름을 입력하세요>>");
//
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		double PI=3.14;
//		double radius= scanner.nextDouble();
//		double result=PI*radius*radius;
//		
//		
//		System.out.println("원의 면적은 "+result+"입니다.");
//		
//		scanner.close();
		System.out.print("반지름을 입력하세요>>");
//		입력받기 위해서 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		
//		반지름 정수로 입력받음
		int radius= scan.nextInt();
		double result=3.14*radius*radius;
		
		System.out.println("원의 면적은 "+result+"입니다.");
		
		scan.close();
				
	}
}
