package mine;

import java.util.Scanner;

public class MileKilometer {
	public static void main(String[] args) {
		System.out.print("마일을 입력하시오: ");
		
		Scanner s = new Scanner(System.in);
	 	double mile = s.nextDouble();
	 	double kilometer = mile*1.609;
	
		
		System.out.println(mile+"마일은 "+kilometer+"킬로미터입니다.");
		
		s.close();
	
}
}
