package question01;

import java.util.Scanner;

public class SeasonExSwith {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		
		String season="잘못 입력하셨습니다.";
//		String season=null;
		Scanner scanner = new Scanner(System.in);
		int month=scanner.nextInt();
		switch (month) {
			case 12:
			case 1:
			case 2:
				season = "겨울";
				break;
			case 3:	case 4:	case 5:
				season = "봄";
//				System.out.println("봄"); /season으로 선언안하고 print해도 됨
				break;
			case 6:	case 7:	case 8:
				season = "여름";
				break;
			case 9:	case 10:case 11:
				season = "가을";
				break;
//			default:
//			System.out.println("잘못 입력하셨습니다.");
//			break;
		}	
		System.out.println(season);
//		if (season!=null) {
//			System.out.println(season);
//		}
		scanner.close();
	}
}
