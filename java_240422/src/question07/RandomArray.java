package question07;

import java.util.Scanner;

public class RandomArray {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int a = scanner.nextInt();//ex>24
		int[] intArray= new int[a];//배열크기가 24
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=(int) (Math.random()*100)+1;
			System.out.print(intArray[i]+" ");
			if(i%10 == 9) {System.out.println();}
		}
	scanner.close();
	}
}
