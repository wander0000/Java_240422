package chapter04;

public class Circle2 {
	
//	4. 멤버변수가 1됨, name은 없음
//	A4. 매개변수 값이 멤버변수로 저장됨
	int radius;
	String name;
	public double getArea() {
		return 3.14*radius*radius;
	}
//	2.생성자 호출됨
	public  Circle2() {
//		3. 반지름 1
		radius =1;
		name=" ";
	}
//	A2.생성자 호출됨(매개변수를 받음)
	public  Circle2(int radius, String n) {
//		매개 변수와 멤버면수가 같은 때 this를 사용하면 경고장 없애줌
//		radius=radius;
//		A3.매개변수 값이 저장.
		this.radius=radius;
		name = n;
	}
	public static void main(String[] args) {
//		Circle2 pizza; // 레퍼런스(참조) 변수 선언
//		//객체생성하면서 생성자 호출(기본생성자 없으면 자동으로 생성해서 호출)
//		//기본 생선자 외에 다른 생성자가 있으면 생성하지 못해서 컴파일 오류		
//		new Circle2();
//		1. 객체 생성하면서 생성자 호출
		/*Circle2 pizza =new Circle2();//반지름 1이고, 이름(name) 없는 상태의 피자 생성
		double area = pizza.getArea();
		System.out.println(area);
		*/
		
//		매개변수 1개를 가지는 생성자가 없어서 오류
//		new Circle2(10);
//		A1. 객체생성 하면서 생성자 호출(매개변수 10,"자바피자"들고 감) 
		Circle2 pizza = new Circle2(10,"자바피자");//반지름이 10,이름 자바피자인 객체pizza 생성
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
//		반지름 1이고, 이름 없는 도넛 생성
//		Circle2 donut = new Circle2();
		Circle2 donut = new Circle2(2, "");
		donut.name="자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
