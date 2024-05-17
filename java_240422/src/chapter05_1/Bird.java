package chapter05_1;

//동물 클래스 상속, 객체생성시 멤버 4개
//추상클래스에 추상메소드가 없어도 됨(객체생성안됨)
//조류라는 이름을 가진 객체를 만들 필요가 없으니 추상클래스로
abstract public class Bird extends Animal{
	public int wing = 2;
	public void walk() {
		System.out.println("walk");
	}
	public void eat() {
		System.out.println("eat");
	}
}
