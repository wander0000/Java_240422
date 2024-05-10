package mine;

public class LogicalOparation {
	public static void main(String[] args) {
		String a="P", b="Q", c="AND", d="OR", e="XOR";
		
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e);
		
		boolean p= true, q= true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p^q)+"\t"+(p|q));
		
		p = true; q =!true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p^q)+"\t"+(p|q));
	
		p= !true; q= true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p^q)+"\t"+(p|q));

		p= !true; q= !true;
		System.out.println(p+"\t"+q+"\t"+(p&q)+"\t"+(p^q)+"\t"+(p|q));
	}
}