package question03;

public class ForSampleTrue {
	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i = 0; i <= 10; i++) {
			if (i<=9) {
				System.out.print(i+"+");
			} else {
				System.out.print(i+"=");
			}
			sum += i;
		}
		System.out.println(sum);
		
	}
}