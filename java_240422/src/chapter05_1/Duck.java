package chapter05_1;

//조류 클래스 상속, 객체생성시 멤버 5개
//extends Bird,Swim : 자바클래스 다중 상속 불가
//public class Penguin extends Bird.Swim{//오류
//인터페이스 다중 상속 가능(implements 키워드 사용)
//추상인터페이스를 상속받았기 때문에 오버라이딩으로 구현해야함
//생명1, 날개2, 건다,먹다,+수영한다,+날다(인터페이스 다중상속)
public class Duck extends Bird implements Swim2,Fly{
	
	@Override
	public void swim() {
		System.out.println("ducks swim");
	}

	@Override
	public void fly() {
		System.out.println("ducks fly");
	}
	
}