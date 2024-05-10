package chapter05;

class Weapon{
	protected int fire() {//스타크래프트-파이어벳
		return 1; //기본 공격법:1
	}
}

class Cannon extends Weapon{//스타크래프트-시즈탱크
	@Override //@는 어노테이션(시스템주석) -> 생략해도 문제 없음
	protected int fire() {//스타크래프트-파이어벳
		return 10; //탱크 공격법:1
	}
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire());//1
		
		weapon = new Cannon();//upcasting
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire());//10
	}
}
