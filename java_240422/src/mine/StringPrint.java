package mine;

import java.util.Scanner;

public class StringPrint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = scanner.nextInt();
		String a=null;
		switch (num) {
			case 1: { a="ONE"; break; } 
			case 2: { a="TWO"; break;}
			case 3: { a="THREE"; break;}
			case 4: { a="FOUR"; break;}
			case 5: { a="FIVE"; break;}
			case 6: { a="SIX"; break;}
			case 7: { a="SEVEN"; break;}
			case 8: { a="EGHIT"; break;}
			case 9: { a="NINE"; break;}
			
		default:
			System.out.println("OTHER");
		}
		System.out.println(a);
		scanner.close();
		}
	}


