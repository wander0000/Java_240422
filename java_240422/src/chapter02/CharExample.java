package chapter02;

public class CharExample {
	public static void main(String[] args) {
		char c1='A';
		char c2=65;
//		\\u~ : 16진수
		char c3='\u0041';
		char c4='가';
//		유니코트 44032 : '가'
		char c5=44032;
//		ac00 16진수는 10진수 44032 임
		char c6='\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}

}
