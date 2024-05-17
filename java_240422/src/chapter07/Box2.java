package chapter07;

//대문자 알파벳 T를 타입파라미터로 받은 제너릭
public class Box2<T> {
	//3.hello//T가 String
	private T t;//타입파라미터를 t의 타입으로 사용
	//타입파라미터를 메소드의 리턴타입으로 사용
	public T get() { //T가 String
		return t;
	}
	//타입파라미터를 메소드의 매개변수타입으로 사용
	//T가 String
	public void set(T t) {//1. hello
		this.t = t;//2.hello
	}
}
