package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue=10;
//		int byteValue=1000;
//		작은 타입을 큰 타입으로 받음: 자동변환
		int intValue=byteValue;
		System.out.println("intValue : "+intValue);
		
		char charValue='가';
//		변수에 '가'의 유니코드인 44032이 저장 출력됨
		intValue = charValue;
		System.out.println("intValue : "+intValue);
		
		intValue=50;
//		작은 타입을 큰 타입으로 받음 : 자동변환
		long longValue = intValue;
		System.out.println("longValue : "+longValue);
		
		longValue=100;
//		정수를 실수로 받음
		float floatValue = longValue;
		System.out.println("floatValue : "+floatValue);
		
		floatValue=100.5f;
		double doubleValue=floatValue;
		System.out.println("doubleValue : "+doubleValue);
	}

}
