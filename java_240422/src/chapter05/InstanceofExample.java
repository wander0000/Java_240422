package chapter05;

public class InstanceofExample {
	
	public static void method1(Parent parent) {
//		instanceof : 객체가 해당 클래스 타입인지 판단(찬, 거짓)
		if (parent instanceof Child) {
//			System.out.println("성공");
			//down castting
			Child child = (Child) parent;
			System.out.println("method1-Child로 변환 성공");
		} else {
			System.out.println("method1-Child로 변환 실패");
		}
	}
	public static void method2(Parent parent) {
			Child child = (Child) parent;
			System.out.println("method1-Child로 변환 성공");
	}
	public static void main(String[] args) {
		//up castting
		Parent parentA = new Child();
//		method1(parentA);//성공
//		method2(parentA);//성공
		
		Parent parentB = new Parent();
//		method1(parentB);//child로 변환 실패
//		method2(parentB);//예외발생(강제변환)
		
		Parent parentC = new Parent();
//		위의 메소드2 호출과 동일(오류가 없는 것 같은데 실행시 오류발생)
//		upcatting 없이 강제변환 시킨 것
		Child child = (Child) parentC;
	}
}
