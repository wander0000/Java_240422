package chapter04;

import java.util.Scanner;
/*
 * static 사용(필드, 메소드)
 * 클래스 이름으로 static 멤버 접근
 * 환율을 입력받아 100만원 몇달러?
 * 환율 ->100달러가 몇원?
 */

//접근지정자 default
class CurrencyConverter{
//	자기 클래스 에서만 접근(객체생성없이)
//	멤버 변수는 일반적으로 private 많이 사용(보완)
//	JSP, Spring 할 때도 많이 사용.
//	메소드를 사용해서 멤버변수를 접근해 사용(직접적인 값 수정을 막음 >보완)
//	getter(ex>getAbc:값을 가져올때), setter(ex>setAbc: 값을 저장할때)메소드를 사용해서 멤버변수 사용
	private static double rate;
	public static void setRate(double rate) {//set으로 시작하면 필드값의 첫글자는 대문자인 메소드
//		매개변수를 클래스멤버(=static 멤버)로 저장 (참고>non-static멤버=객체멤버)
		CurrencyConverter.rate = rate;
	}
//	1300원, 환율1300 > 1300원/환율1300=1달러
	public static double toDollar(double won) {
		return won/rate;
//	1달러, 환율1300 > 1달러*환율1300=1300원
	}
	public static double toWon(double dollar) {
		return dollar*rate;
	}
}
public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("환율(1달러)>>");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("백만원은 $"+CurrencyConverter.toDollar(1000000)+"입니다.");
		System.out.println("백$는 "+CurrencyConverter.toWon(100)+"원입니다.");
		
		scanner.close();
	}
}
