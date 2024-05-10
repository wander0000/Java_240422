package chapter05;
/*
 * super() 사용
 */

class Point2{//4. 멤버저장(0, 0, "blue") //d.(5, 6, "blue")
	private int x,y;
	public Point2() {//2.조부모 생성자 호출 (5, 6, "blue") /b.(5, 6, "blue")
		this.x = this.y = 0;//3. 멤버저장(0, 0, "blue") /c.(5, 6, "blue")
	}
	
	public Point2(int x, int y) {
		this.x = x;	this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
		
	}
}

class ColorPoint2 extends Point2{
	private String color;
	public ColorPoint2(int x, int y, String color) {//1.부모생성자호출 (5, 6, "blue")
		super(x, y);//a. 부모생성자호출 (5, 6, "blue")
		this.color = color;//5. (0, 0, "blue") //e.(5, 6, "blue")
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
		
	}
	
}
public class SuperEx {
	public static void main(String[] args) {
		//1. 객체생성, (0,0) Blue 셋팅
		ColorPoint2 cp =new ColorPoint2(5, 6, "blue");
		cp.showColorPoint();
	}
}
