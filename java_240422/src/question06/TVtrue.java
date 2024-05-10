package question06;

public class TVtrue {
	
	String brand;
	int year, size;
	
	public TVtrue(String brand, int year, int size) {
		this.brand =brand;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.print(brand+"에서 만든 ");
		System.out.print(year+"년형 ");
		System.out.print(size+"인치 TV");
	}
	public static void main(String[] args) {
		TVtrue myTV = new TVtrue("LG",2017,32);
		myTV.show();
	}
}
