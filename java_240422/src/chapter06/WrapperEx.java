package chapter06;

public class WrapperEx {
	public static void main(String[] args) {
		char c1='4', c2='F';
		//isDigit : 숫자인지 체크
		if (Character.isDigit(c1)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		if (Character.isDigit(c2)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		
		//isAlphabetic : 영문자인지 체크
		if (Character.isAlphabetic(c1)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println("숫자");
		} else {
			System.out.println("숫자 아님");
		}
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));//1c(16+12=28(16진수))
		System.out.println(Integer.toBinaryString(28));//11100=16+8+4
		System.out.println(Integer.bitCount(28));//3(11100)-> 1이 3개 (2진수에서 1의 개수)
		
		Double d = Double.valueOf(3.14);//3.14를 포함하는 객체를 가리키는 d 참조변수
		System.out.println(d.toString());//실수 3.14출력
		
		boolean b =(4>3);
		//Boolean.toString(b) : Boolean Wrapper 클래스의 toString 메소드로 불린값을 문자열로 변환
		System.out.println(Boolean.toString(b));//문자열 true 출력
		System.out.println(Boolean.parseBoolean("false"));//불린값 false 출력
		
	}
}
