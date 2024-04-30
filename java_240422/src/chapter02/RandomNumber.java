package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		int n=rollDie();
		System.out.println("주사위의 눈 : "+n);
	}
//	매개변수가 없는 메소드(주사위의 숫자 구하기=1~6)
public static int rollDie() {
//	random 메소드 : 난수(0.0이상1.0미만)을 임의로 줌, 실수타입
//	Math.random();
//	6 * Math.random();//0이상 6미만 난수 발생
	double x= 6 * Math.random();
//	(int) x; //0~5의 난수(정수)
	int temp = (int)x;
//	1~6 의 난수를 반환
	return temp+1;
}
}
