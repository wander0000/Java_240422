package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		
		int sum =0;
//		1.첫번째 방법
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("10개의 정수를 입력하세요.");
//		int[] intArray =  new int[10];
		
//		2. 배열의 크기를 먼저 정하고 쓸수도 있어
		int[] intArray =  new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length+"개의 정수를 입력하세요.");
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
			}
		System.out.println("합계는 "+sum);
		scanner.close();
	}
}
