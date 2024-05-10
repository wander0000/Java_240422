package question03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		
		int number;
		boolean multiple=false;
		
		System.out.print("양의 정수를 입력하세요");
		Scanner scanner =new Scanner(System.in);
		number = scanner.nextInt();
		
		while (multiple) {
			if(number%3 ==0);
		}
		
//		int a =number%3, b=number%5, c=number%8;
		
		
//		if (a==0 && b==0 && c==0) {
//			System.out.println("3의 배수이다.");
//			System.out.println("5의 배수이다.");
//			System.out.println("8의 배수이다.");
//			multiple = true;
//		} else if (a==0 && b==0 && c !=0){
//			System.out.println("3의 배수이다.");
//			System.out.println("5의 배수이다.");
//			multiple = true;
//		} else if (a!=0 && b==0 && c ==0){
//			System.out.println("5의 배수이다.");
//			System.out.println("8의 배수이다.");
//			multiple = true;
//		} else if (a==0){
//			System.out.println("3의 배수이다.");
//			multiple = true;
//		} else if (b==0){
//			System.out.println("5의 배수이다.");
//			multiple = true;
//		} else if (c==0){
//			System.out.println("8의 배수이다.");
//			multiple = true;
//		} else {
//			multiple = false;
//			System.out.println("어느 배수도 아니다");
//			
//		}
		scanner.close();
		
	}
}
