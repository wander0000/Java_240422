package question02;

import java.util.Scanner;

public class TaxiFare {
	public static void main(String[] args) {
		
		int income=0;
		int fare;
		Scanner s = new Scanner(System.in);
		
		for (int i = 1; i < 11; i++) {
			System.out.print("요금을 입력하세요: ");
			fare = s.nextInt();
			income += fare;
		} 
		System.out.println("총 수입 :"+income);
		s.close();
	}
}
