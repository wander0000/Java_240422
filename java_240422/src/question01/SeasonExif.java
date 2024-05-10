package question01;

import java.util.Scanner;

public class SeasonExif {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		
		Scanner scanner = new Scanner(System.in);
//		변수 이름은 누가봐도 알수 있게 연관성 있는걸로, a보다는 month
		int month = scanner.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println("봄");
		} else if (month>=6 && month<=8) {
			System.out.println("여름");
		} else if (month>=9 && month<=11) {
			System.out.println("가을");
		} else if (month==1 || month==2 || month==12) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력");
		}
		
		scanner.close();
	
	}
}
