package chapter04;

public class Book {
//	4. 멤버 저장
//	A4. 멤버 저장
	String title;//멤버변수(필드) //"어린왕자" //"춘향전"
	String author;//멤버변수(필드) //"생택쥐베리" //작자미상
	
	//생성자 - 클래스명과 이름이 같은 메소드, 여러개일 수 있음(오버로딩)
//	2."어린왕자","생택쥐베리" 2개를 매개 변수로 받는다
	public  Book(String t, String a) {
//		3. 매개변수를 멤버로 저장
		title=t;//매개변수를 멤버변수에 저장
		author=a;//매개변수를 멤버변수에 저장
	}
//	A2."춘향전" 1개를 매개 변수로 받는다
	public  Book(String t) {
//		A3. 매개변수를 멤버로 저장
		title=t; //"춘향전"
		author="작자미상";
	}
	
	public static void main(String[] args) {
//		 기본 생성자를 자동으로 만들어서 호출(컴파일러)
//		 new Book();//생성자가 하나라도 존재하면 자동으로 기본생성자를 만들지 못해서 오류
		
//		1. 매개변수 가지고 생성자 호출
		Book littlePrince = new Book("어린왕자","생택쥐베리");
//		A1. 매개변수 가지고 생성자 호출
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}
