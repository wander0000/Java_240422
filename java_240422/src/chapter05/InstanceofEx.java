package chapter05;
/*
 * Instanceof 연산자 사용(상속)
 */

class  Person {}
class  Student extends Person{}
class  Resercher extends Person{}
class  Professor extends Resercher{}


public class InstanceofEx {
	//Person p=new Student() -> 업캐스팅
	static void print(Person p) {//p 객체가 Person 클래스 타입인지 판단
		if (p instanceof Person) {
			System.out.print("Person ");//참이면 출력
		}
		if (p instanceof Student) {
			System.out.print("Student ");//참이면 출력
		}
		if (p instanceof Resercher) {
			System.out.print("Resercher ");//참이면 출력
		}
		if (p instanceof Professor) {
			System.out.print("Professor ");//참이면 출력
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student->\t"); print(new Student());//Person Student 
		System.out.print("new Student->\t"); print(new Resercher());//Person Resercher
		System.out.print("new Student->\t"); print(new Professor());//Person Resercher
	}
}
