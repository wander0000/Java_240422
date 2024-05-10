package chapter03;
/*
 * main 메소드 매개 변수 이용
 */
public class Calc {
//	args : main 메소드 매개변수 String[] : 타입=문자열
	public static void main(String[] args) {
		double sum=0.0;
		
//		main 메소드 매개변수 크기만큼 반복
		for (int i = 0; i < args.length; i++) {
//			parseDouble(args[i]) : 실수(double)로 변환하는 메소드
			sum += Double.parseDouble(args[i]);
		}
		
		System.out.println("합계 : "+sum);
	}
}
