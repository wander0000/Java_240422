package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();//List에 커서위치하고 ctr+T
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");//2번 인덱스에 삽입
		list.add("Spring");
		
		
		int size = list.size();
		System.out.println("총 list 갯수: "+size);
		
		String skill = list.get(2);
		System.out.println("2번째 인덱스: "+skill);//2번 인덱스에 삽입되어서 "Servlet/JSP"이 밀려남
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			/*
			 *  0:Java
				1:JDBC
				2:Database
				3:Servlet/JSP
				4:Spring
			 */
			System.out.println(i+":"+str);
		}
		System.out.println();
		list.remove(2);//index로 객체 삭제(뒤에 데이터가 앞으로 당겨짐
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		list.remove("Spring");//객체 지정하여 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}
}
