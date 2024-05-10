package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		System.out.print("5개의 정수를 입력하세요>>" );
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]= scanner.nextInt();
		}

		double avarg = 0;
		double sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		
		avarg = sum/ intArray.length;
		
		System.out.println("평군은 "+avarg);
		scanner.close();
}
}
