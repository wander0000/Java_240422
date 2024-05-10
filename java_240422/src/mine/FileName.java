package mine;

import java.util.Scanner;

public class FileName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a, b, c, d;
		System.out.print("드라이브 이름: ");
		a = scanner.next();
		System.out.print("디렉토리 이름: ");
		b = scanner.next();
		System.out.print("파일 이름: ");
		c = scanner.next();
		System.out.print("확장자: ");
		d = scanner.next();
		
		System.out.println();
		System.out.println(a+":"+b+c+"."+d);
		scanner.close();
	}
}
