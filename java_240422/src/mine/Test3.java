package mine;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.print("정수 2개를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int min=0, max=0;
		
		if (x != y) {
			if (x > y) {
				min = y; max = x;
			} else {
				min = x; max = y;
			}
		} else {
			System.out.println("둘은 같은 수 입니다.");
		}
		System.out.println("둘 중 작은 수는 "+min+"이고, 큰 수는 "+max+"입니다.");
		scanner.close();
	}
}
