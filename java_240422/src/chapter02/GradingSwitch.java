package chapter02;

import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {

			System.out.print("점수를 입력하세요(0~100) :");
			char grade;
			Scanner scan = new Scanner(System.in);
			int score = scan.nextInt();
			switch (score/10) {
			case 10://100점
//				grade 상태값이 같은 특수한 경우에는 생략할 수 있음
//				grade = 'A'
//				break;
			case 9://90~99점
				grade = 'A';
				break;
			case 8://80~89점
				grade = 'B';
				break;
			case 7://70~79점
				grade = 'C';
				break;
			case 6://60~69점
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			
//			if (score >= 90) {
//				grade='A';
//			} else if (score >= 80) {
//				grade='B';
//			} else if (score >= 70) {
//				grade='C';
//			} else if (score >= 60) {
//				grade='E';
//			} else {
//				grade='F';
//			}
			System.out.println("학점은 "+grade+"입니다.");
			
			scan.close();
		}

	}


