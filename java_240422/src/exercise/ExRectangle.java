package exercise;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		System.out.print("가로, 세로 길이를 입력하세요>>");
		Scanner scan = new Scanner(System.in);
//		첫버째 정수를 가로 변수로 입력받음
		int width= scan.nextInt();
//		첫버째 정수를 세로 변수로 입력받음
		int height= scan.nextInt();
		int RectangleArea=width*height;
		
		System.out.println("사각형의 면적은 "+RectangleArea+"입니다.");
		scan.close();
	
	}
}
