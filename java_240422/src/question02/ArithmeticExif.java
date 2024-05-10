package question02;

import java.util.Scanner;

public class ArithmeticExif {
	public static void main(String[] args) {
		System.out.print("연산>>");
		
		Scanner scanner = new Scanner(System.in);
		int op1=scanner.nextInt();
		String op = scanner.next();
		int op2=scanner.nextInt();
		int res=0;
		
		if(op.equals("+")) {
			res = op1 + op2;
//			System.out.println(op1+op+op2+"의 계산 결과는 "+res);
		} else if (op.equals("-")) {
			res = op1 - op2;
//			System.out.println(op1+op+op2+"의 계산 결과는 "+res);
		} else if (op.equals("*")) {
			res = op1 * op2;
//			System.out.println(op1+op+op2+"의 계산 결과는 "+res);
		} else if(op.equals("/")) {
			if ( op2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
				scanner.close();
				return;
			} else {
				res = op1 / op2;
			} 
		} else {
				System.out.println("사칙연산이 아닙니다");
				scanner.close();
				return;
			}
			System.out.println(op1+op+op2+"의 계산 결과는 "+res);
			scanner.close();
		
	}
}
