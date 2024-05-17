package question07;

public class ArrayParameterEx {
	
	static void printStringArray(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}System.out.println();		
	}
	
	static void replaceBe(String[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i]=s[i].replace("be","eat");
			System.out.print(s[i]+" ");
		}System.out.println();			
	}
	
	public static void main(String[] args) {
		          String[] s ={"to","be","or","not","to","be"};
          printStringArray(s);
          replaceBe(s);
	}
}
