package mine;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("속도를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int speed = scanner.nextInt();
		
		if ((speed >=60) && (speed<= 100)) {
			System.out.println("정상속도");
		} else {
			System.out.println("위반속도");
		}
		scanner.close();
	}
}
