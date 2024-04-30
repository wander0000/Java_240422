package exercise;

import java.util.Scanner;

//class 여러개 사용해도 무관
class Aaa{}
class Baa{}
//public class : 자바파일 안에 두개이상 존재시 오류
//public class Caa{}
//1. JVM 이 수많은 class 에서 public class를 찾아감

public class ExCalculation {
//	메소드method 여러 개 사용해도 무관
	public static void aaa() {}
	public static void bbb() {}
//	2. JVM 이 수많은 method 에서 main 메소드를 찾아감
//	절차지향 언어가 아니라 객체 지향 언어이기 때문
	public static void main(String[] args) {
		
		System.out.print("두 개의 실수 입력>>");
		Scanner scan = new Scanner(System.in);
		
//		double a = scan.nextDouble();
//		double b = scan.nextDouble();
		float a = scan.nextFloat();
		float b = scan.nextFloat();
//		
//		System.out.println("두수의 덧셈은 "+(double)(a+b));
//		System.out.println("두수의 뻴셈은 "+(double)(a-b));
//		System.out.println("두수의 곱셈은 "+(double)(a*b));
//		System.out.println("두수의 나눗셈은 "+(double)(a/b));
////	
		System.out.println("두수의 덧셈은 "+(a+b));
		System.out.println("두수의 뻴셈은 "+(a-b));
		System.out.println("두수의 곱셈은 "+(a*b));
		System.out.println("두수의 나눗셈은 "+(a/b));
		
		scan.close();

	}

}
