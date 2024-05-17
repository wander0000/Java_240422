package chapter07;

//T=Tv, M=String
public class Product<T, M> {
	//T=Tv, M=String
	//3.kind=new Tv()
	private T kind;
	//4.model = "스마트 tv"
	private M model;
	//T=Tv가 메소드의 리턴타입
	public T getKind() {
		return kind;
	}
	//T=Tv가 매개변수의 타입
	//2. T kind=new Tv()
	public void setKind(T kind) {
		this.kind = kind;
	}
	//M=String가 메소드의 리턴타입
	public M getModel() {
		return model;
	}
	//M=String가 매개변수의 타입
	//b. String model = "스마트 tv"
	public void setModel(M model) {
		this.model = model;
	}
}
