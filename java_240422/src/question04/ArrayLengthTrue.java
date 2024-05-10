package question04;

import java.util.Scanner;

public class ArrayLengthTrue {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		int sum=0;
		
		System.out.print(intArray.length+"개의 정수를 입력하세요>> " );
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]= scanner.nextInt();
			sum += intArray[i];
		}

		System.out.println("평군은 "+(double)sum/intArray.length);
		scanner.close();
}
}
