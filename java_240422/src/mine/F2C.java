package mine;

import java.util.Scanner;

public class F2C {
	public static void main(String[] args) {
		System.out.println("================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("================");
		System.out.println();
		System.out.print("번호를 선택하시오: ");
		Scanner s = new Scanner(System.in);
		int temp=s.nextInt();
		
		if (temp==1) {
			System.out.print("화씨 온도를 입력하시오: ");
			double f_temp=s.nextDouble();
			double c_temp = 5*(f_temp-32)/9;
			System.out.println("섭씨 온도는 "+c_temp);
		} else {
			System.out.print("섭씨 온도를 입력하시오: ");
			double c_temp=s.nextDouble();
			double f_temp = (((9*c_temp)/5)+32);
			System.out.println("화씨 온도는 "+f_temp);
		}
		s.close();
	} 
}
