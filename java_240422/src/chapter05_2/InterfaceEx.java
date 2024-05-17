package chapter05_2;

//기본문, 전화를 걸어 100초 동안 응답없으면 타임아웃
//전화거는 기능, 받는 기능, 화면에 폰이라고 출력
interface PhoneInterface{
//	public static final int TIMEOUT = 100;//상수
	int TIMEOUT =100;//public static final 생략됨
//	public abstract void sendCall();//추상메소드
	void sendCall();//public abstract 생략
	void recieveCall();//public abstract 생략
	default void printLogo() {//일반메소드는 구현해야함. 중괄호 반드시
		System.out.println("** Phone**");
	}	
}

//삼성폰 만들 때 기본폰 기능 사용(전화거는 기능, 받는 기능)
class SamsungPhone implements PhoneInterface{
	
	
	//추상메소드 2개 오버라이딩
	@Override
	public void sendCall() {
		System.out.println("띠리리리리링");
	}

	@Override
	public void recieveCall() {
		System.out.println("전화가 왔습니다.");
	}

	//삼성폰 고유의 기능
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();//인터페이스 상속받아서 사용
		phone.sendCall();//추상메소드 구현해서 사용
		phone.recieveCall();//추상메소드 구현해서 사용
		phone.flash();//고유기능
	}
}
