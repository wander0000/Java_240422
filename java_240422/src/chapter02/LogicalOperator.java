package chapter02;

public class LogicalOperator {
	public static void main(String[] args) {
//		문자끼리 비교는 유니코드 크기로 비교됨
		System.out.println('a' > 'b');
		System.out.println('a' < 'b');

		System.out.println(-1 < 0);
		System.out.println(3 >= 2);
		System.out.println("=======================");
		System.out.println(3.45 >= 2);
		System.out.println(3 == 2);
//		!= 두 값이 다른가
		System.out.println(3 != 2);
//		NOT연산자 !, 논리값의 결과를 반대로
		System.out.println(!(3 != 2));
		System.out.println("=======================");
//		참 && 거짓 = 거짓
		System.out.println((3 > 2) && (3 > 4));
//		참 || 거짓 = 참 (OR 두 논리값 중 하나라도 참이면 참,
		System.out.println((3 != 2) || (3 > 4));
//		참 ^ 거짓 = 참 xor=두 논리값이 다르면 참, 같으면 거짓
		System.out.println((3 != 2) ^ (3 > 4));
		
		
		
	}

}
