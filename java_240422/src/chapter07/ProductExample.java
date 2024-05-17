package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());//1.제너릭의 메소드 호출
		product1.setModel("스마트 tv");//a.제너릭 메소드 호출
		
		Tv tv = product1.getKind();//new Tv()
		//chapter07.Tv@3d012ddd(패키지.클래스@해시코드)
		System.out.println(tv);
		
		String tvModel = product1.getModel();
		System.out.println(tvModel);//스마트 tv
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		System.out.println(car);//chapter07.Car@5e91993f
		String carModel = product2.getModel();
		System.out.println(carModel);//디젤
	}
}
