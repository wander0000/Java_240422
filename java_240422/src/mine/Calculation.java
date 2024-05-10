package mine;

import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		System.out.print("x: ");
		
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		System.out.print("y: ");
		int y=scanner.nextInt();
		
		int sum = x + y;
		int minus = x - y;
		int multi = x * y;
		double average = sum/2;
		
		System.out.println("두 수의 합: "+sum);
		System.out.println("두 수의 차: "+minus);
		System.out.println("두 수의 합: "+multi);
		System.out.println("두 수의 합: "+average);
		
		if (x<y) {
			System.out.println("큰 수: "+y);
			System.out.println("작은 수: "+x);
		} else {
			System.out.println("큰 수: "+x);
			System.out.println("작은 수: "+y);
		}
		
		scanner.close();
	}

}
