package exercise;

import java.util.Scanner;

public class Won2Dollar2 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("원화를 입력하세요(단위 원)>>");
			int won = scan.nextInt();
			double dollar= exchange(won);
			
			System.out.println(won+"원은"+"$"+dollar+"입니다.");
			
			scan.close();
		}
		public static double exchange(int w) {
			return w/1100;
		}
}
