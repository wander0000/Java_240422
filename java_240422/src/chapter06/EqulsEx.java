package chapter06;

class Point3{
	private int x,y;

	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override//Object 클래스가 가진 메소드 오버라이딩
	public boolean equals(Object obj) {//업캐스팅 Object obj=new Point3(2,3)
		Point3 p=(Point3) obj;//다운캐스팅
		if(x ==p.x && y== p.y) {//x=a의 변수값, p.x=>b의 변수값
			return true;
		}else { return false;}
	}	
}
public class EqulsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2,3);
		Point3 b = new Point3(2,3);
		Point3 c = new Point3(3,4);
		
		if ( a==b ) {//객체 비교
			System.out.println("a == b");
		}else {
			System.out.println("a != b");
		}
		//equals() : 기본은 객체 비교
		//객체의 값을 비교 > 메소드 오버리아딩 해서 객체값을 비교하도록 함
		if ( a.equals(b) ) {//객체 비교
			System.out.println("a is equal to b");
		}else {
			System.out.println("a is not equal to b");
		}
		
		if ( a.equals(c) ) {
			System.out.println("a is equal to c");
		}else {
			System.out.println("a is not equal to c");
		}
	}
}
