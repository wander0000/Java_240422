package question02;

import java.util.Scanner;

public class TaxiFare_true {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요금을 입력하세요: ");
		int income=0;
		int fare = s.nextInt();
		
		for (int i = 1; i < 11; i++) {
			income +=fare;
			System.out.println("요금을 입력하세요:"+income);
		} 
		
		for (int i = 0; i < 10; i++) {
			income +=(fare*i);
		}
		System.out.println("총 수입 :"+income);
		
		s.close();
	}
}
