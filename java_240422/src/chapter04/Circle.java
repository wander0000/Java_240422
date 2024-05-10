package chapter04;

public class Circle {
//	멤버변수(필드)
	int radius;
	String name;
	
//	오버로딩
	public Circle() {} //클래스명과 이름이 같은 메소드 : 생성자(기본)
	public Circle(int a) {}//클래스명과 이름이 같은 메소드 : 생성자(매개변수=파라미터:1개)
	public Circle(int a,int b) {}//클래스명과 이름이 같은 메소드 : 생성자(매개변수=파라미터:2개)
	
	
	public double getArea() {//멤버함수(메소드)
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza; // pizza:참조변수(태명 비슷) 선언, Circle: 클래스(객체 생성하는 틀, 판)
//		new Circle();//객체 생성, 이름없는 Circle
		pizza = new Circle(); // 객체생성하면서 이름 pizza 라고 정해줌
		pizza.radius=10;//멤버변수 값 셋팅, pizza:객체, radius:필드,멤버변수
		pizza.name="자바피자";//멤버변수 값 셋팅
		double area = pizza.getArea();//멤버함수(메소드) 호출
		System.out.println(pizza.name+"의 면적은 "+area);//pizza.name:멤버변수 값 사용
		
		Circle donut= new Circle();//객체 생성, Circle클래스를 이용해서 이름 donut(참조변수)
		donut.radius=2;
		donut.name="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);//pizza.name:멤버변수 값 사용
	}
}
