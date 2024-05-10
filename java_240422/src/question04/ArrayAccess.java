package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		
		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			System.out.print("");
		}
		
//		int max = Math.max(arr[0],arr[1],arr[2],arr[3],arr[4]);		
		
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println("가장 큰 수는 "+max+"입니다.");
		scanner.close();
		
	}
}

