package chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		//n을 값으로 가지는 객체 생성(intObject:참조변수)
		Integer intObject = Integer.valueOf(n);//boxing
		Integer intObject2 = n;//auto-boxing
		
		//10 출력
		System.out.println("intObject= "+intObject);
		System.out.println("intObject2= "+intObject2);
		
//		int m = intObject.intValue()+intObject2.intValue();//unboxing
		int m = intObject+intObject2;//auto-unboxing
		System.out.println("m= "+m);
	}
}
