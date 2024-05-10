package question06;

public class RandomTen {
	public static void main(String[] args) {
		int[] intArray = new int[10];

		int sum=0;
//		1. 내가 한거
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random()*10)+1;
			System.out.print(intArray[i]+" ");
			sum += intArray[i];
		}
		
//		2. 2번째 방법
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < intArray.length; i++) {
			int r = (int) (Math.random()*10)+1; //1~10
			intArray[i] = r;//난수를 배열에 저장
			sum += intArray[i];//베열 원소의 누적 합계
			System.out.print(intArray[i]+" ");
		}
		
//		3. 간단히!
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		
		System.out.println();
		System.out.println("평균은 "+sum/10);
	}
}
