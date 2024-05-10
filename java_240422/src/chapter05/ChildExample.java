package chapter05;

public class ChildExample {
	public static void main(String[] args) {
//		Parent 클래스에서 기본 생성자 만들어서 호출하고,
//		Child 클래스에 기본생성자 만들어서 호출
		//객체생성하고 업캐스팅
		//Parent타입으로 sub class 객체 생성
		Parent parent = new Child(); 
		parent.field1="data1";
//		업캐스팅 된 객체는 서브클래스 멤버 접근 불가
//		parent.field2="data2";
		parent.method1();
		parent.method2();
//		업캐스팅 된 객체는 서브클래스 멤버 접근 불가
//		parent.method3();
		
		Child child = (Child) parent;//다운캐스팅
//		다운캐스팅 객체는 서브클래스 멤버 접근 가능
		child.field2="yyy";
//		다운캐스팅 객체는 서브클래스 멤버 접근 가능
		child.method3();
	}
}
