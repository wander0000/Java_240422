package chapter03;
/*
 * 구구단 배열로 생성
 * 값을 넣어본다 ex: 2*7=14, 9*4=36
 */
public class Ex3_9 {
	public static void main(String[] args) {
//		정수 타입의 2차원 배열선언(1차원은 열로 구성, 1차원이 2개 이상 가지고 행을 구성)
//		int[][] gugudan;
//		2차원 배열 선언, 생성(9행 9열)
//		int[][] gugudan = new int[9][9]; //인덱스 0~8
		int[][] gugudan = new int[10][10]; //인덱스 0~9
		
//		1*1=1 ~9*9=81
		for (int i = 1; i <= 9; i++) { //행 기준
			for (int j = 1; j <= 9; j++) { //열 기준
//				행렬에 1*1~9*9 까지 값을 2차원 배열 원소에 저장
				gugudan[i][j]=i*j; //i:행 j:열
			}
		}
		System.out.println("2 x 7 = "+gugudan[2][7]);
		System.out.println("9 x 4 = "+gugudan[9][4]);
	}
}
