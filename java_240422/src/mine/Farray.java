package mine;

public class Farray {
	public static void main(String[] args) {
		double[] farray = new double[10];
		double sum =0;
//		for (int i = 0; i < farray.length; i++) {
//			double num=farray[i];
//			num = Math.random();
//			System.out.println(num);
//		}
//		 
		for (int i = 0; i < farray.length; i++) {
			farray[i]= Math.random();
		}
		
		 for (double d : farray) {
			System.out.println(d);
			sum +=d;
		}
		 System.out.println("10개의 부동소수점 난수의 합은"+sum);
	}
}
