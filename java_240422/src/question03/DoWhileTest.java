package question03;

public class DoWhileTest {
	public static void main(String[] args) {
		int i=0, sum=0;
		
//		sum은 i의 누적합계이고, i는 2씩 커질 텐데, 만약 i>99되면 멈춤(break)
		do {
			if ( i>99) { break;}
			sum += i;
			i = i+2; //i +=2 도 같은 식
					
		} while (true);{
		}
		System.out.println(sum);
	}
}
