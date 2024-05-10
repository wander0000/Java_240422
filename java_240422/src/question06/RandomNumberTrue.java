package question06;

import java.util.Random;

/*
 * 난수를 생성 Math(클래스), Random(클래스)
 */
public class RandomNumberTrue {
	public static void main(String[] args) {
		int rNumber=0;
		Random generator=new Random();
		
//		generator.nextInt();//난수발생(범위 int타입 범위 - >2~31승~2의 31승-1)
//		generator.nextInt(10);//난수발생(0~9의 정수)
//		generator.nextInt(10)+1;//난수발생(1~10의 정수)
//		generator.nextInt(10)*(-1)1;////난수발생(-9~0의 정수)
//		
//		nextDouble(), nextFloat(),nextlong(),nextboolean()
		
		
		while (true) {
			rNumber = generator.nextInt(10)+1;
			System.out.println(rNumber);
			if (rNumber == 7) { break; }
		} 
	}
}
