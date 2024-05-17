package chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a= new String(" C#");//heap 메모리에 저장
		String b= new String(",C++ ");
		
		//length() : 문자열의 길이
		System.out.println(a.length());//C#의 길이는 3(스페이스 포함)
		//contains("#") : 문자열에 해당 문자가 포함되어 있는지 t/f로 반환
		System.out.println(a.contains("#"));//true
		System.out.println(a.contains("*"));//false		
		
		a = a.concat(b);//concat() : 문자열 연결
		System.out.println(a);// C#,C++ (새로운 문자열을 a 가 가리킴)
		
		a=a.trim();//trim() : 앞뒤 공백 제거(중간은 아님)
		System.out.println(a);//C#,C++
		
		a=a.replace("C#","Java");//replace() : 문자열 대체
		System.out.println(a);//Java,C++
		
		String[] s =a.split(",");//split(기준문자열):기준문자열을 기준으로 양쪽으로 문자열을 분리
		for (int i = 0; i < s.length; i++) {//분리된 문자열0:Java,분리된 문자열1:C++
			System.out.println("분리된 문자열"+i+":"+s[i]);//Java,C++
		}
		
		a=a.substring(5);//substring() : 인덱스값으로 부터 시작하는 문자열
		System.out.println(a);//C++ (5번째문자부터 출력됨)
		
		char c =a.charAt(2);//charAt() : 인덱스에 해당한 문자
		System.out.println(c);//+ (a="C++" 2번째 문자 +출력)
	}
}
