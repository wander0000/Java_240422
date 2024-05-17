package chapter08;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}
public class HashSettExample {
	public static void main(String[] args) {
		//Set 인터페이스 컬렉션 타입으로 HashSet 클래스 객체 생성
		Set<String> set =new HashSet<>();//업캐스팅
//		Set<Object> set =new HashSet<>();//업캐스팅
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
//		set.add("Java");//set컬렉션 중복 객체 추가 불가
//		AA a = new AA();
//		set.add(a);//클래스객체인 a를 담음/ <Object>타입으로 사용가능
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체의 수는: "+size);
		//set컬렉션 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 값을 받음
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {//iterator 객체 값이 있으면
			String element = (String) iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");//객체 선택 삭제
		System.out.println("총 객체의 수는: "+set.size());
//		Iterator<String> iterator2 = set.iterator();
//		while(iterator2.hasNext()) {//iterator 객체 값이 있으면
//			String element = (String) iterator2.next();
//			System.out.println("\t"+element);
//		}
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		if(set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		}else {
			System.out.println("객체 있음");
		}
		
		set.clear();//객체 모두 삭제
		if(set.isEmpty()) {//객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		}else {
			System.out.println("객체 있음");
		}
				
		
		
		
	}
}
