package question06;

public class BabySum {
	public static void main(String[] args) {
		int[][] baby = new int[120][5];
		int sum = 0;
//		baby.length:120 120번 반복
		for (int month=0; month < baby.length; month++) {
			for (int country = 0; country < baby[month].length; country++) {
				baby[month][country]=(month+1)*100+(country+1);
				sum += baby[month][country];
			}
		}
//		System.out.println(baby[0][0]);
		System.out.println("10년간 5개 나라의 총 신생아수는 "+sum);
	}

}
