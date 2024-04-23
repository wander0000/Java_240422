package chapter02;
/*
 * 작성일 : 2024-04-23
 * 작성자 : 서연주
 * 내용 : 
 */
public class Copy {
	public static void main(String[] args) {
//		Strin 타입	
//		origin : 변수(명)
//		String 타입의 변수 선언
//		String orgin;
//		origin 변수의 초기값 설정
		String orgin="가나다라" ;
		String copy=orgin;
		System.out.println(orgin);
		System.out.println(copy);
		copy = copy + "마바사";
		System.out.println(copy);
	}
}
