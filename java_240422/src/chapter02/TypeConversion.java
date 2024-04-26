package chapter02;

public class TypeConversion {
	public static void main(String[] args) {
		byte b=127;
		int i=10;
		
//		연산결과는 큰타입으로 int타입이 됨
		System.out.println(b+i);
//		정수 기본타입int로 연산		
		System.out.println(10/4);
//		실수 큰 타입으로 계삼됨(double>int)
		System.out.println(10.0/4);
//		실수 연산으로 결과는 실수
		System.out.println(2.9+1.8);
//		(int2.9)>실수2로 변환 그래서 결과 2+1.8=3.8
		System.out.println((int)2.9+1.8);
		System.out.println((int)2.9+(int)1.8);
//		2.9+1.8을 계산한 다음 실수4로 변환
		System.out.println((int)(2.9+1.8));
		
		
	}
}
