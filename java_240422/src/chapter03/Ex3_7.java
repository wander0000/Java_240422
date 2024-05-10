package chapter03;

public class Ex3_7 {
	public static void main(String[] args) {
		int[] event = {0,2,4,6,8,10,12,14,16,18};
		int[] primes = {2,3,5,7,11,13,17,19};
		
		
//		1. 짝수 배열을 메소드 매개변수로 호출
//		5. 합계를 받아서 eventSum에 저장
		int evenSum = sum(event);
//		int evenSum = sum(event[]); /오류
		int primeSum = sum(primes);
		
		
		System.out.println("짝수 배열의 합: "+evenSum);
		System.out.println("소수 배열의 합: "+primeSum);
	
		}
	
	
//	int:리턴타입 sum(): 메소드, return 0;=리턴값 
//	리턴타입과 리턴값의 타입이 일치해야합
	//위세 배열을 더하는데 int는 정수이므로 타입이 맞지 않아 오류
//	public static int sum(int arr) {
//	2. err로 event를 받는다
//	배열을 받아서 합계를 구하는 메소드
	public static int sum(int[] arr) {
		
		int sum=0;
//		매개변수 배열의 크기만큼 반복하면서 sum에 합계 누적
//		3. arr 배열원소(0,2,4,6,8,10,12,14,16,18)를 가지고 반복해서 합계구함
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
//		4. 합계로 변환
		return sum;
	}
}
