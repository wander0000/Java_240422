package mine;

import java.util.Scanner;

public class Rest {
	public static void main(String[] args) {
		System.out.print("오렌지의 개수를 입력하시오:");
		Scanner s = new Scanner(System.in);
		int orange = s.nextInt();
		int box = orange/10;
		int rest = orange%10;
		
		System.out.println(box+"박스가 필요하고 "+rest+"개가 남습니다.");
		
		s.close();
	}
}
