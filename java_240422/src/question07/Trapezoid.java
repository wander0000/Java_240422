package question07;

import java.util.Scanner;

public class Trapezoid {
	
	int down, up, height;
		
	public Trapezoid(int down, int up, int height) {
		super();
		this.down = down;
		this.up = up;
		this.height = height;
	}

	public double getArea() {
		return (double)(((down+up)*height)/2);
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("아랫변, 윗변, 높이를 입력하시오>> ");
		int down = scanner.nextInt();
		int up = scanner.nextInt();
		int height = scanner.nextInt();
		Trapezoid trapez = new Trapezoid(down,up,height);
		System.out.println("사다리꼴의 면적은 "+trapez.getArea()); 
		
		scanner.close();
	}
}
