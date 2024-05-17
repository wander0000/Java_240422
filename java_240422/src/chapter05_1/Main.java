package chapter05_1;

public class Main {
	public static void main(String[] args) {
//		new Animal();//추상클래스인 Animal로는 객체생성 못함
		Animal a;//참조변수 선언은 된다
//		new Bird();//추상클래스인 Bird로는 객체생성 못함
		Penguin p = new Penguin();
		p.swim();//멤버5개(생명1,날개2,건다,먹다,+수영한다,+날다) 중 수영한다
		
		Bird p2 = new Penguin();//upcasting
//		p2.swim();//업캐스팅은 슈퍼클래스 멤버에만 접근 가능
		p2.walk();
		Penguin p3 = (Penguin) p2;//downcasting
		p3.swim();//다운 캐스팅은 모든 멤버 접근가능
		
		Bird d = new Duck();//업캐스팅
		d.eat();
		Duck d2 = (Duck) d;//다운캐스팅
		d2.fly();
		
		//추상클래스를 참조변수 선언(슈퍼클래스)
		Animal d3 = new Duck();//업캐스팅
		int x = d3.life;
		System.out.println("x====>"+x);
		
//		new Swim2();//인터페이스는 객체생성 못한다
//		인터페이스를 참조변수 선언(인터페이스 타입의 객체는 가능하단 얘기)
		Swim2 s = new Penguin();
		s.swim();
		
//		인터페이스가 인터페이스 배열 2개를 가리킨다
//		객체 배열 생성과 형태가 비슷
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin();//s2[0]:참조변수
		s2[1] = new Duck();//s2[1]:참조변수
		s2[0].swim();//펭귄이 수영한다
		s2[1].swim();//오리가 수영한다
		//컴파일러 단계는 알 수 없고, 런타임 실행시 오류발생
//		s2[2] = new Penguin();//배열인덱스범위오류
	}
}
