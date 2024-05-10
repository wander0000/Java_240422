package chapter04;

//접근지정자 default
class Calc{
	//static(클래스) 멤버는 객체 생성없이 클래스 이름으로 사용가능.
//	public static int abs(int a) {
//	non-static은 접근 불가능
//	public int abs(int a) {
//	private은 접근 불가능, 같은 클래스 안에서만 접근가능
//	private int abs(int a) {
//	protected 접근지정자는 같은 페키지안+다른페키지(상속)에서만 접근가능
//	protected int abs(int a) {
	protected static int abs(int a) {
		return a>0?a:-a;//절대값 반환(a가 양수면 a, 음수면 -붙여서)
	}
	static int max(int a, int b) {
		return a>b?a:b;//둘 중 큰 수 반환
	}
	public static int min(int a, int b) {
		return a>b?b:a;//둘 중 작은 수 반환
	}
}

//접근지정자 public
public class CalcEx {
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));//static(클래스) 멤버는 객체 생성없이 클래스 이름으로 사용가능.
		System.out.println(Calc.max(10,0));//default 접근지정자. 접근 가능
		System.out.println(Calc.min(-3,-8));//public 접근지정자. 접근 가능
	}

}
