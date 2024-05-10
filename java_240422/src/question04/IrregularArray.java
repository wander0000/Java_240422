package question04;

public class IrregularArray {
	public static void main(String[] args) {
//		선언, 생성, 초기화를 한번에 하는 방법
//		int irregArr[][] = {{10,11,12},{20,21},{30,31,32},{40,41}};
	
//	    비정방형 배열 : 행만 정의하고 열은 비워둠
		int irregArr[][] = new int[4][];
		irregArr[0] = new int[3];
		irregArr[1] = new int[2];
		irregArr[2] = new int[3];
		irregArr[3] = new int[2];

//		4번 반복
		for (int i = 0; i < irregArr.length; i++) { //행의 크기만큼 반복
//			3, 2,3,2번 반복
			for (int j = 0; j < irregArr[i].length; j++) {// 열의 크기만큼 반복
				irregArr[i][j]=(i+1)*10+j;
				System.out.print(irregArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
