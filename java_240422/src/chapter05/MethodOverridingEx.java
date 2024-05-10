package chapter05;


class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
//	오버라이딩(void 리턴타입 일치, draw 메소드명 일치, 매개변수 없는거 일치)
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverridingEx {
//	Shape p = new Line() >  업캐스팅
	static void paint(Shape p) {
//		업캐스팅에 의해 슈퍼클래스의 draw()메소드로 갔다가 오버라이딩 되어서 Line으로 감
//		동적바인딩
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);//Line(업캐스팅, 오버라이딩)
		paint(new Shape());//Shape
		paint(new Rect());//Rect
		paint(new Circle());//Circle
	}
}
