package chapter02;

public class LongOperationExample {
public static void main(String[] args) {
	byte value1=10;
	int value2=100;
	long value3=1000;
	
//	큰 타입을 따라가니 타입이 안맞아서 오류
//	int result = value1+value2+value3;
//	연산된 결과에서 가장 큰 타입인 long을 타입 int로 변환
	int result = (int)(value1+value2+value3);
	System.out.println(result);
}
}
