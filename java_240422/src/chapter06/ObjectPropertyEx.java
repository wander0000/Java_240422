package chapter06;

class Point{
	private int x,y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class ObjectPropertyEx {
	public static void print(Object obj) {//Object obj=new Point(2,3) > 업캐스팅
		System.out.println(obj.getClass());//getClass() : 현재 실행중인 클래스 프린트함
		System.out.println(obj.getClass().getName());//getClass().getName() : "패키지면.클래스명"프린트함
		System.out.println(obj.hashCode());//hashCode() : 객체의 서명(10진수 해시코드)
		System.out.println(obj.toString());//toString() : 패키지,클래스@16진수 해시코드
		System.out.println(obj);//toString()생략(문자열로 변환해서 출력)
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p);
	}
}
