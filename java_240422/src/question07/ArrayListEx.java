package question07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>> ");
			list.add(scanner.next()); 
		}
			
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(str+" ");
		}System.out.println();
		
		String max = "1";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).length() > max.length()) {
				max=list.get(i);
			}
		}
		System.out.println("가장 긴 이름은 :"+max);
		scanner.close();
	}
}
