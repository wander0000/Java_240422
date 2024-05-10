package question04;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CoronaSum {
	public static void main(String[] args) {
		
		int sum = 0;
//		int corona[][] = {{11,12,13}
//						 ,{21,22,23}
//						 ,{31,32,33}
//						 ,{41,42,43}
//						 ,{51,52,53}
//						 ,{61,62,63}
//						 ,{71,72,73}
//						 ,{81,82,83}
//						 ,{91,92,93}
//						 ,{101,102,103}
//						 ,{111,112,113}
//						 ,{121,122,123}};
		
		int corona[][] = new int[12][3];
			for (int i = 0; i < corona.length; i++) {
				for (int j = 0; j < corona[i].length; j++) {
				corona[i][j] = (i+1)*10+j+1;
				System.out.print(corona[i][j]+ " ");
				sum += corona[i][j];
				}
				System.out.println();
				System.out.println("1년 전체 코로나 환자수는 "+sum);
			}
			/*
			for (int i = 0; i < corona.length; i++) {
				for (int j = 0; j < corona[i].length; j++) {
					sum += corona[i][j];
				}
			}
			System.out.println("1년 전체 코로나 환자수는 "+sum);
			*/
//				
////		행 기준(1~12월), corona.length : 12
//		for (int month = 0; month < corona.length; month++) {
//			for (int city = 0; city < corona[month].length; city++) {
//				sum += corona[month][city];
//			}
//		} 
//		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}
