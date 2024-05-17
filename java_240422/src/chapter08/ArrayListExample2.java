package chapter08;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		//ArrayList 클래스 타입으로 ArrayList 클래스로 객체 생성(제너릭 타입파라미터를 String)
		ArrayList<String> array = new ArrayList<>();
		boolean aaa= array.add("oracle");
		System.out.println(aaa);
		boolean bbb= array.add("Mysql");
		System.out.println(bbb);
		boolean ccc= array.add("oracle");
		System.out.println(ccc);//중복된 객체가 추가되어도 문제 없음
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i+":"+str);
		}
	}
}
