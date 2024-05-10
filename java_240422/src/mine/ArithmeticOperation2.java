package mine;

import java.util.Scanner;

public class ArithmeticOperation2 {
	public static void main(String[] args) {
		int airSpeed,lightSpeed, distanece;
		int sec=1;
		
		System.out.println("시간간격을 입력하시오(단위: 초)");
		Scanner scanner = new Scanner(System.in);
		int time= scanner.nextInt();
		lightSpeed = 300000000/sec;
		airSpeed = 340/sec;
		
		
		distanece= (time*airSpeed*lightSpeed)/(lightSpeed-airSpeed);
		System.out.println("번개가 발생한 곳까지의 거리는 "+distanece+"m");
		scanner.close();
		
	}
}
