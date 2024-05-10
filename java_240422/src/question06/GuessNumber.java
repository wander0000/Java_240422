package question06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rNumber=0; 
		Random generator=new Random(10);
		rNumber = generator.nextInt(10)+1;
		int guessNum=0;
		
		do {
			System.out.println("추측한 숫자를 입력하세요: ");
			guessNum=scanner.nextInt();
			if(guessNum > rNumber) {
				System.out.println("추측한 숫자가 틀렸습니다.");
				System.out.println("추측한 숫자가 너무 큽니다.");
			} else {
				System.out.println("추측한 숫자가 틀렸습니다.");
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
		}while (guessNum != rNumber);
		System.out.println("맞추셨습니다.");
		scanner.close();
	}
}
