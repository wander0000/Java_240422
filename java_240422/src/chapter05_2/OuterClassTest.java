package chapter05_2;

class OuterClass{//외부클래스
//	private String secret="Time is money";
	public String secret="Time is money";
	public OuterClass() {//2. 달걀의 생성자 호출됨
		new InnerClass();//3. 노른자 객체 생성
		InnerClass obj = new InnerClass();//1.노른자 객체 생성
		obj.method();//a. 노른자 객체를 통해 내부멤버에 접근
	}

	public class InnerClass{//내부(중첩 or inner) 클래스
//	private class InnerClass{//내부(중첩 or inner) 클래스
		public InnerClass() {//4.노른자의 생성자 호출됨
			System.out.println("내부클래스의 생성자입니다.");
		}
		//b
		public void method() {
			//노른자에서 달걀의 private에 접근가능
			//c
			System.out.println(secret);
		}
	}
}
public class OuterClassTest {
	public static void main(String[] args) {
//		new OuterClass();//1 달걀 객체 생성
		OuterClass outer = new OuterClass();//1.달걀 객체 생성
		outer.secret="";//접근제한자 private이면 접근 못함.
//		new InnerClass();// 접근제한, 노른자 객체 생성(private던 아니던)할 수 없음
	}
}
