package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		Object box2 = new Box();//업캐스팅
		box.set("홍길동");
		String name = (String) box.get();//다운캐스팅
		System.out.println(name);
		
		box.set(777);
		int number =(int) box.get();//다운캐스팅
		System.out.println(number);
		
		box.set(new Apple());
		Apple apple =(Apple) box.get();//다운캐스팅
		System.out.println(apple);//chapter07.Apple@515f550a
	}
}
