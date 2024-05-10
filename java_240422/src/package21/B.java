package package21;

public class B {
	public B() {
		A a=new A();//객체생성, 생성자호출 field1,2,3=1로 초기화
		a.field1=2;
		a.field2=2;
//		private 멤버는 자기 클래스 안에서만 접근
//		a.field3=2;
		
		a.method1();
		a.method2();
//		private 멤버는 자기 클래스 안에서만 접근
//		a.method3();
	}

}
