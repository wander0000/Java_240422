package chapter05;


abstract class Calculator{//추상클래스 선언: 추상메소드 없어도 됨
//	public int add(int a, int b) {return 1;}
//	public abstract int add(int a, int b) {return 1;}//추상메소드인데 구현하려해서
	public abstract int add(int a, int b);//추상메소드 선언
	public abstract int subtract(int a, int b);//추상메소드 선언
	public abstract double avarage(int[] a);//추상메소드 선언
}


public class GoodCalc extends Calculator {
	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();//추상클래스 이면 객체 생성 못핰
		System.out.println(c.add(2, 3));//5
		System.out.println(c.subtract(2, 3));//5
		System.out.println(c.avarage(new int[] {2,3,4}));//3.0
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double avarage(int[] a) {
		double sum= 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
}

//public abstract class GoodCalc extends Calculator {
//GoodCalc c = new GoodCalc();//추상클래스 이면 객체 생성 못함
//}
