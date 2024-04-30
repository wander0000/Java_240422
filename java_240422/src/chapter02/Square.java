package chapter02;

//1. public class 찾아감
public class Square {
//	void : 리턴 탑(리턴(반환) 할 것이 없다)
//	2. main메소드 찾아감
	public static void main(String[] args) {
		int n=4;
//		square();//메소드 호출부
//		square(4);//메소드 호출부
//		3. 메소드 호출
//		square(n);//메소드 호출부
		int s = square(n);//메소드 호출부
		System.out.println("한변의 길이가 "+n+"인 정사각형의 넓이 : "+s);
		
//		square : 메소드명(호출부에서 파라미터가 있으면 오류
	}	
//	int lengthe : int 타입의 매겨변수(인자, 파라미터) : n -> length로 받음
//	public static void square(int length) { //메소드 정의부
//	4. 메소드 호출됨
		public static int square(int length) { 
			//메소드 정의부 type을 int로 바꾸고 return 에 정수값 들어가면 오류없음
//		return;
//		return "";//리턴타입불일치시 오류(void타입인데 String으로 받아서)
//		return 0;//리턴타입불일치시 오류(void타입인데 Int으로 받아서)
		
//			5. length를 제곱해서 반환
		return length*length;
		
	}
}
