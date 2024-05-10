package question06;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		int[] Array = new int[10];
		
		System.out.println("양수 10개를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < Array.length; i++) {
			int num = scanner.nextInt();
			Array[i]=num;			
		}
		
		int max = Array[0];
		int min = Array[0];
		
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] > max) {
				max = Array[i];
			}
			if (Array[i] < min) {
				min = Array[i];
			}
		}
		System.out.println("가장 작은 수는 "+min+"이고, "+"가장 큰 수는 "+max+"이고,");
		System.out.println("최소값+최대값은 "+(min+max)+"이고, ");
		scanner.close();
	}

}
