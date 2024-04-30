package chapter02;

import java.util.Scanner;

/*
 * 커피주문을 받아서 커피명과 가격을 출력
 */
public class CoffeePrice {
	public static void main(String[] args) {
		System.out.print("무슨 커피를 드릴까요?");
		Scanner scan = new Scanner(System.in);
//		next() : 문자열 입력받는 메소드
		String order = scan.next();
//		커피 가격 변수 선언
//		int price; 선언이 안되서
		int price=0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노":
			price=2000;
			break;

//			생략가능
//		default:
//			break;
		default:
			System.out.println("메뉴에 없습니다!");
			break;
		}
//		price가 0이 아닐때 아래 문장이 출력되도록
//		if문으로 넣어줌
		if (price !=0) {
			System.out.println(order+"는 "+price+"원 입니다.");
		}
//		System.out.println(order+"는 "+price+"원 입니다.");
		
		scan.close();
		
	}
}
