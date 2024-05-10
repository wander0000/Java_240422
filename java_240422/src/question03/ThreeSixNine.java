package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		System.out.print("10~99 사이의 정수를 입력하시고>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int oneDigit = a%10;
		int tenDigit = a/10;
		int count = 0;
		
//		3,6,9일때
		if (tenDigit%3 == 0 ) {
//			카운트 증가
			count++;
		} else if ((oneDigit%3 == 0) && (oneDigit != 0)) {
//			카운트 증가
			count++;
		} 
		
		if(count == 2) {
			System.out.println("박수짝짝");
		} else if (count ==1) {
			System.out.println("박수짝");
		} else {
			System.out.println(a);
		}
		
		scanner.close();
	}
}
		
		
//		if((oneDigit !=0)) {
//			
//			if((tenDigit%3 == 0) && (oneDigit%3 == 0)){
//			} else if  ((oneDigit%3 == 0) || (tenDigit%3 == 0)) {
//				System.out.println("박수짝");
//			}
//		} else {
//			System.out.println(a);
//		} 
		
		
