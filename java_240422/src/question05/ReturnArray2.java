package question05;
/*
 * 배열리턴2(메소드이용)
 * 일차원 배열 생성(정수 1~10)
 * 배열리턴 > 배열원소+100 > 출력
 */
public class ReturnArray2 {
	public static int[] makeArray() {
		int temp[] = new int[10];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1;
		}
		return temp;
	}
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
			for (int i = 0; i < intArray.length; i++) {
				System.out.print(intArray[i]+100+" ");
			}
	}
}


