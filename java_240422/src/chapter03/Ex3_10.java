package chapter03;
/*
 *4년 전체 평점(평균 학점)의 평균 구하기
 *2차원 배열 이용해서 원소로 초기화
 *1행1열 부터 4행 2열까지
 * length 필드 이용(행/열 크기)
 */
public class Ex3_10 {
	public static void main(String[] args) {
		double sum=0;
		//2차원 배열(4행 2열)
		//만점 기준 : 4.5
		double score[][] = {{3.3, 3.4}//1행 1열, 2열
						   ,{3.3, 3.6}//2행 1열, 2열
						   ,{3.7, 4.0}//3행 1열, 2열
						   ,{4.1, 4.2}//4행 1열, 2열
						   };
//		 score.length : 4 (행의 크기)
		for (int i = 0; i < score.length; i++) {
//			score[i].length : 2(열의 크기)
//			score[0].length~score[3].length
			for (int j = 0; j < score[i].length; j++) {
//				3.3~4.2 점수를 합계 누적
//				score[i][j] : 2차원 배열 원소
//				반복이 끝나면 4년 전체(8학기)의 총평점의 합계가 누락됨
				sum += score[i][j]; //배열 인덱스(0,0~3,1)까지 배열 원소에 sum에 누적
				
			}
		
		}
		
		int n= score.length;//4(행의 크기)
		int m = score[0].length;//2(열의 크기)
		
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m));
		}
		
	}

