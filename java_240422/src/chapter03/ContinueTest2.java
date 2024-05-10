package chapter03;
/*
 * countinue 문 이용해서
 * 문자열에서 특정 문자를 찾는다
 * 찾은 갯수를 출력
 * 예)life is cool. (l>2개)
 */
public class ContinueTest2 {
	public static void main(String[] args) {
		int count=0;
		String s="no news is good news";
		
		char[] charS = s.toCharArray();
		
		for (int i = 0; i < charS.length; i++) {
			
			if (charS[i] == 'N'||charS[i] == 'n' ) {
				continue;
			}
		count++;
		}
		System.out.println("문장에서 발견된 n의 갯수 : "+count);
	}
}
