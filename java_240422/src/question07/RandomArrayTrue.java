package question07;

import java.util.Scanner;

public class RandomArrayTrue {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int a = scanner.nextInt();//ex>24
		int[] intArray= new int[a];//배열크기가 24
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=(int) (Math.random()*100)+1;
			if(i==0) {
				System.out.print(intArray[i]+" ");
			}else {
				if(i%10==0){System.out.println();}//10번째 마다 엔터친다
			}
		}
	scanner.close();
	}
}
