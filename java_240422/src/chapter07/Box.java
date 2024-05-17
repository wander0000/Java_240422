package chapter07;

public class Box {
	private Object object;//홍길동, 777, Apple객체
	
	public Object get() {
		return object;
	}
	//Object object = "홍길동", 업캐스팅
	//Object object = 777, 업캐스팅
	//Object object = new Apple(), 업캐스팅
	public void set(Object object) {
		this.object = object;
	}
}
