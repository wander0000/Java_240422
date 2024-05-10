package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
//		10의 자리 : 나누기 10해서 몫
//		1의 자리 : 나누기 10해서 나머리
		int ten = n/10;
		int one = n%10;
		
		if (ten==one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
				} else {
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		scan.close();
	}
}

//		int a = scan.nextInt();
//		
//		if ((a/10)==(a%10)) {
//			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
//		} else {
//			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
//		}
//		
//		scan.close();