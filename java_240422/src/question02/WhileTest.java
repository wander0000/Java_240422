package question02;

public class WhileTest {
	public static void main(String[] args) {
		
		int n=0;
		int sum=0;
		
//		while (n<100) {
//			if (n%2==0) {
//				sum+=n;}
//				n++; }
		
		while (n<100) {
			sum +=n;
			n +=2;			
//			계산과정을 다 볼 수도 있어
//			System.out.println("@# i====>"+n);
//			System.out.println("@# sum====>"+sum);
		}
			System.out.println(sum);
	}
}
