package chapter02;

public class ByteExample {
	public static void main(String[] args) {
		int var1=-129;
//		byte var2=-129;범위를 벗어나서 오류(byte는8bit)
		byte var2=-30;
		byte var3=0;
		byte var4=-30;
//		int var5=128; 범위벗어나서 오류
		int var5=127;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}
	

}
