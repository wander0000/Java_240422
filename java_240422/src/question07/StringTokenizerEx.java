package question07;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer st = new StringTokenizer(str, "/");
		
		while (st.hasMoreElements()) {//hasMoreElements() : 토큰이 있으면 참
			System.out.println(st.nextToken());
		}
	}
}
