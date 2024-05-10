package question03;

public class Gugudan {
	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			for (int j = 1; j <10; j++) {
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			 정렬 맞추려면 tab 사용
				System.out.print(i+"*"+j+"="+i*j+"\t");
						}
//			단이 끝날 때 마다 공백 출력
			System.out.println();
		}
	}
}
