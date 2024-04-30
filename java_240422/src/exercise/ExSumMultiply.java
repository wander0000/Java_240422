package exercise;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리수 정수 입력(100~999)>>");
		
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int hundred=n/100; //100의 자리수
		int ten = (n%100)/10; //10의 자리수, 나누기 100의 나머지를 10으로 나눈 몫
//		int one = n%10;//1의 자리수,
		int one = (n%100)%10;//이렇게 표현할 수도

		int sum = hundred + ten;
		int multiply = ten * one;
		System.out.println("100의 자리와 10의 자리의 합은 "+sum);
		System.out.println("10의 자리와 1의 자리의 곱은 "+multiply);
		
		scan.close();
	}
}
//		System.out.println("100의 자리와 10의 자리의 합은 "+(hundred+ten));
//		System.out.println("100의 자리와 10의 자리의 합은 "+hundred+ten);
//		System.out.println("10의 자리와 1의 자리의 곱은 "+(ten*one));
//		System.out.println("10의 자리와 1의 자리의 곱은 "+ten*one);
//		
//		scan.close();
//	}
//}
