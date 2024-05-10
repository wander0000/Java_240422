package chapter03;

import java.util.Scanner;

/*
 * 문자열을 정수로 변환
 * 변환 안될때를 대비해서 예외 처리
 */
public class NumberFormatException {
	public static void main(String[] args) {
		
//		String[] strinNumber= {"23", "12","3","998"};
		String[] strinNumber= {"23", "12","aaa","998.8"};
		int i;
		
		for (i = 0; i < strinNumber.length; i++) {
			try {
//				Integer : Wrapper 클래스
//				parseInt() : 문자열을 정수로 변환하는 메소드
				int j = Integer.parseInt(strinNumber[i]);
				System.out.println("숫자로 변환된 값은 "+j);
			} catch (Exception e) {
				System.out.println(strinNumber[i]+"는 정수로 변환할 수 없습니다.");
			}
		}
	}
}
