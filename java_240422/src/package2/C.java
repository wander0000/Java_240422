package package2;

//다른 패캐지에서 접근할 때 import
import package1.A;
import package1.B;

public class C {
//	default 접근지정자는 다른 패키지에서 접근시 오류
	A a;
	B b;
}
