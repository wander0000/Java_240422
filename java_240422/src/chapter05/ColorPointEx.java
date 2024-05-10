package chapter05;
/*
 * Point 클래스:(x,y) 한점을 표현
 * Point 클래스를 상속받은 ColorPoint 클래스(색을 가진 점)
 */
class Point{
	private int x,y;//4. (1,2)
	public void set(int x, int y) {//2. (1,2)
		this.x = x; this.y = y;//3. (1,2)
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

//ColorPoint는 자식(서브), Point는 부모(슈퍼)
class ColorPoint extends Point{
	private String color;//a4.("red")
	public void setColor(String color) {//setter a2.("red")
		this.color = color;//a3.("red") 
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();//객체를 생성, 멤버는 4개 생성자 호출(기본)
//		1. 메소드 호출
		p.set(1, 2);
		p.showPoint();
		
//		객체를 생성, 멤버는 7개(부모3,조부모4개), 생성자 호출(기본):Poinr(슈퍼)->ColorPoint
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4);
		cp.showPoint();
//		a1. red값을 가지고 메소드 호출
		cp.setColor("red");
		cp.showColorPoint();
	}
}
