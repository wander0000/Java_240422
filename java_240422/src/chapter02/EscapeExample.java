package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
//		백슬래시t : 탭만큼 띄움
//		println : 엔터적용   
		System.out.println("번호\t이름\t직업");
		System.out.println("번호이름직업");
//		print : 엔터적용안됨
//		백슬래시n : 엔터(줄바꿈)
		System.out.print("번호이름직업");
		System.out.print("번호이름직업");
		System.out.println("번호\t이름\t직업\n");
		System.out.print("번호이름직업");
		System.out.print("번호이름직업");
		System.out.println();//공백도 엔터
		System.out.println("우리는 개발자 입니다.");
//		System.out.println("우리는"개발자" 입니다.");는 오류
		System.out.println("우리는 \"개발자\"입니다.");
		System.out.println("봄여름가을겨울");
//		System.out.println("봄\여름\가을\겨울");는 오류
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
