package exercise;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		System.out.print("가로, 세로 길이를 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		
		int width= scan.nextInt();
		int height= scan.nextInt();
		int area=width*height;
		
		System.out.println("사각형의 면적은 "+area+"입니다.");
		scan.close();
	
}
}
