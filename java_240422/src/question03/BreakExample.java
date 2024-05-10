package question03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		System.out.println("exit을 입력하면 종료합니다.");
		System.out.print(">>");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String a = scanner.next();
			
			if (a.equals("exit")) {
				break;
			}
		}
		System.out.println("종료합니다...");
		
		scanner.close();
	
}
}
