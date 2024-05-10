package question06;

public class RandomNumber1 {
	public static void main(String[] args) {
		int rNumber=0;
		
		while (rNumber != 7) {
			rNumber = (int) (Math.random()*10)+1;
			System.out.println(rNumber);
		} 
	}
}
