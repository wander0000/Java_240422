package chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer("This");
		System.out.println(sb);//This
		
		sb.append( " is pencil");//append() : 문자열을 연결(추가되면서 수정)
		System.out.println(sb);//This is pencil
		
		sb.insert(7, " my");//insert() : is 다음에 my 삽입
		System.out.println(sb);//This is my pencil
		
		sb.replace(8, 10, "your");//replace() : 8번째다음부터 10번째까지 대체문자 삽입 my > your
		System.out.println(sb);//This is your pencil
		
		sb.delete(8, 13);//delete() : 8번째다음부터 13번째까지 삭제
		System.out.println(sb);//This is pencil
		
		sb.setLength(4);//setLength() : 문자열길이 4로 수정
		System.out.println(sb);//This
	}
}
