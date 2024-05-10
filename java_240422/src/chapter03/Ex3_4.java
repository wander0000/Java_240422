package chapter03;

public class Ex3_4 {
	public static void main(String[] args) {
//		names 라는 문자열의 값을 가지는 배열 선언
//		String[] names;
//		배열 선언, 생성, 초기화
//		배열 원소값 =4, 인덱스는 1~3까지
//		String[] names= {"Sam","Kate,"Jhon","Jenny"};
//		String 배열 객체 생성(인덱스4인)
//		String[] names= new String[5];
		
////		names : 참조(레퍼런스)변수
//		String[] names; //배열 선언
//		names = new String[5]; //배열 생성
//		names[0]="aaa"; //0번째 인덱스에 aaa 문자열 값(원소) 할당
		
//		배열 선언, 생성
//		int 기본값 0
		int[] names= new int [5];
	
//		System.out.println(names[-1]);//인덱스는 0부터
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
//		System.out.println(names[5]);//인덱스크기보다 큰수는 들어갈 수 없음
		
	}
}
