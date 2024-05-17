package question07;

public class TwoDArray {
	public static void main(String[] args) {
		
		int[][] twoDArray = new int[4][4];
		
		//twoDArray.length :4
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				twoDArray[i][j] = (int)((Math.random()*10)+1);
				System.out.print(twoDArray[i][j]+"\t");
			}System.out.println();
		}
	}
}
