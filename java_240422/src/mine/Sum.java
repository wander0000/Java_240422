package mine;

public class Sum {
	public static void main(String[] args) {
	
		
		int sum=0;
		int i=1;
		while (i<100) {
			if(i%6 == 0)
			sum += i;
			i++;
		}
//		for 문 사용
//		int i=0, sum=0;
//		
//			for (i = 0; i <100 ; i++) {
//				if(i%6 == 0) {
//					sum += i;
//			}
//		}
		System.out.println(sum);
	}
}
