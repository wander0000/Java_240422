package question07;
/*
 * 사다리꼴 면적+0.5*(윗변+아랫변)*높이
 * 필드:아랫변 윗변, 높이
 * 아랫변,윗변, 높이 입력받아서 객체에 필드로 접근해서 입력ㄹ
 */
import java.util.Scanner;

public class TrapezoidTrue {
	
	int down, up, height;
		
	public double getArea() {
		return 0.5*(down+up)*height;
	}

	public static void main(String[] args) {
		
		TrapezoidTrue trapez = new TrapezoidTrue();//컴파일러-기본생성자 자동호출
		Scanner scanner = new Scanner(System.in);
		System.out.print("아랫변, 윗변, 높이를 입력하시오>> ");
		trapez.down = scanner.nextInt();//객체로 멤버에 접근
		trapez. up = scanner.nextInt();//객체로 멤버에 접근
		trapez.height = scanner.nextInt();//객체로 멤버에 접근
		System.out.println("사다리꼴의 면적은 "+trapez.getArea()); 
		
		scanner.close();
	}
}

