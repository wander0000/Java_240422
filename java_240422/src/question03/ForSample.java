package question03;

import java.util.Scanner;

public class ForSample {
	public static void main(String[] args) {
		System.out.print("정수 2개를 입력하시오: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
//		int a;
//		int b=10;
		int sum=0;
			
		for (a=1; a <= b; a++) {
			sum += a;
//			if (a==10) {
			if (a==b) {
				System.out.println(a+"="+sum);
			} else {
				System.out.print(a+"+");
			}
			scanner.close();
		}
	}
}
