package chapter03;

/*
 * 배열 리턴(메소드 이용)
 */
public class ReturnArray {
//	makeArray() : 메소드
//	int[] :리턴타입
//	리턴 타입에 배열 크기를 표시하면 오류
//	static int[4] makeArray() {
	static int[] makeArray() {
//		배열 생성시 타입이 리턴타입과의 불일치시 오류
//		int temp[] = new String[4];
		int temp[] = new int[4];
		
//		temp.length = 4
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i; //0 1 2 3
		}
		
//		return 0; / 배열타입인데 정수로 리턴해서 오류
//		return temp[]; /리턴할때 []를 추가하면 오류
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];//배열 선언
//		메소드 호출
//		makeArray();
		intArray=makeArray();//temp 배열 받음 // 0 1 2 3
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+ " ");
		}
	}
}
