package chapter03;

import java.util.Scanner;

/*
 * 구구단 출력
 */
public class LoopExample2 {
	public static void main(String[] args) {
		int n;
		int i=1;
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
		Scanner scanner = new Scanner(System.in);
		n= scanner.nextInt();
		
//		1~9까지 실행
		while (i<=9) {
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
		scanner.close();
	}
}
