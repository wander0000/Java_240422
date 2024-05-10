package question06;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberTrue {
	public static void main(String[] args) {
		int rNumber; 
		int guessNum;
		
		Random generator=new Random();
		rNumber = generator.nextInt(10)+1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("추측한 숫자를 입력하세요: ");
		guessNum=scanner.nextInt();
		
		while (guessNum != rNumber) {
			System.out.println("추측한 숫자가 틀렸습니다.");
			if(guessNum > rNumber) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			} else {
				System.out.println("추측한 숫자가 너무 작습니다.");
			}
			System.out.println("추측한 숫자를 입력하세요: ");
			guessNum=scanner.nextInt();
		}
		System.out.println("맞추셨습니다.");
		scanner.close();
	}
}
