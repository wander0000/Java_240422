package mine;

import java.util.ArrayList;
import java.util.List;

class Circle{
	private int radius;

	public Circle() {
		this.radius=(int)((Math.random()*100)+1);
	}

	public int get() {
		return radius;
	}
	
}
public class Chap05Prog05 {
	public static void main(String[] args) {
		Circle[] c = new Circle[3];
		  
		for (int i = 0; i < 3; i++) {
			c[i]=new Circle();
			System.out.println("Circle [radius="+c[i].get()+"]");
		}
	}
}
