package chapter03;
/*
 * 문자열에서 r 알파벳 갯수 구하기
 * 알파벳 대/소문자 상관없음
 * toCharArry() 메소드 이용
 */
public class Ex3_8 {
	public static void main(String[] args) {
		int count=0;
		String str="Programing is fun! Right?";
//		toCharArray() : 문자열에서 문자 하나씩 가지고 옴(P~?)
//		charArr : 배열, 레퍼런스 변수, 참조변수
		char[] charArr = str.toCharArray();
		
//		charArr.length :<Programing is fun! Right?>의 문자열 크기
		for (int i = 0; i < charArr.length; i++) {
//			charArr[i] : 배열원소, 배열원소값
			if (charArr[i] == 'R' ||charArr[i] == 'r' ) {
				count++;
			}
		}
		System.out.println("=> R(r)의 갯수: "+count);
	}
}
