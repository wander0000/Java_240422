package chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
		//제네릭의 타입파라미터 : String
//		Box2<String> box1=new Box2<String>();
		//자바7부터 생략가능한 다이아몬드 파라미터<>
		Box2<String> box1=new Box2<>();
		box1.set("hello");
		//컴파일단계에서 제너릭 타입 감지,생성단계에서 String으로 정해졌기때문
//		box1.set(777);//오류
		String greet = box1.get();
		System.out.println(greet);
		
		Box2<Integer> box2=new Box2<>();
		box2.set(777);
		//컴파일단계에서 제너릭 타입 감지,생성단계에서 Integer로 정해졌기때문
//		box2.set("hello");//오류
		int value = box2.get();//Integer를 int로(언박싱)
		System.out.println(value);
		
	}
}
