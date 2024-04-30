package chapter02;

import java.util.Scanner;

public class MultioleOfThree {
	public static void main(String[] args) {
		System.out.print("수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if (number % 3 ==0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		scan.close();
	}

}
