package package22;

import package21.A;

public class C {
	public C() {
		A a=new A();
		a.field1=2;
//		default, private 다른패키지 접근 불가
//		a.field2=2;
//		a.field3=2;
		
		a.method1();
//		default, private 다른패키지 접근 불가
//		a.method2();
//		a.method3();
		
	}
}
