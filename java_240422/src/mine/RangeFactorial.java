package mine;

import java.util.Scanner;

public class RangeFactorial {
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	System.out.print("숫자입력 : ");
	int a=scan.nextInt();
	System.out.print("숫자입력 : ");
	int b=scan.nextInt();
	int min=0, max=0, sum=0;
	
	if (a != b) {
	  if (a>b) {
		   min = b;
		   max = a;
	  } else {
		min = a;
		max = b;
	  } 
	  
	  for (int i =0; i <= max-min; i++) {
		System.out.print(min+"+");
		min += 1;	
		sum += min;
	  }
	    System.out.print(max+"="+sum+"입니다");
	  
	} else {
		System.out.println("둘은 같은 값입니다.");
		
	}
	
}
}
