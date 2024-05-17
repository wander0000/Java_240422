package question07;

/*
 * String[] 사용
 * 메소드를 호출해서 문자열을 변경
 * to be or not to be -> to eat or not to eat
 */
	
public class ArrayParameterExTrue {
	
	//문자열 배열을 매개변수로 받아서 출력
	static void printStringArray(String a[] ) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}System.out.println();		
	}
	
	//문자열 배열을 매개변수로 받아서 "be"이면 "eat"로 변경
	static void replaceBe(String a[]) {
		for (int i = 0; i < a.length; i++) {
//			a[i]=a[i].replace("be","eat");//같은 결과값
			if (a[i].equals("be")) {a[i]="eat";};
		}		
	}
	public static void main(String[] args) {
		
          String s[] ={"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
          printStringArray(s);
          replaceBe(s);
          printStringArray(s);
	}
}
