package chapter05_2;

//전화거는 기능, 받는 기능, 화면에 폰이라고 출력
interface PhoneInterface2{
	int TIMEOUT =100;
	void sendCall();
	void recieveCall();
	default void printLogo() {
		System.out.println("** Phone**");
	}	
}

//PCS( ex> 016,018,109
//인터페이스 간의 상속 -> extends 사용
interface MobilePhoneInterface extends PhoneInterface2{
	void sensSMS();
	void receiveSMS();
}

//MP3 :음악재생, 정지 기능을 추상메소드로 선언
interface MP3Interface{
	void play();
	void stop();
}

//PDA : 계산기능을 메소드로 구현
class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}

//아이폰 : 계산기능, 문자전송, 음악기능 상속받음
class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
	
	@Override
	public void sendCall() {
		System.out.println("띠리리리리링");
	}
	@Override
	public void recieveCall() {
		System.out.println("전화가 왔습니다.");
	}
	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
	}
	@Override
	public void sensSMS() {
		System.out.println("문자를 보냅니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자가 왔습니다.");
	}
	public void schedule() {
		System.out.println("일정을 관리합니다.");
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();//음악을 연주합니다.
		System.out.println(phone.calculate(3, 5));//8
		phone.schedule();//일정을 관리합니다.
	}
}
