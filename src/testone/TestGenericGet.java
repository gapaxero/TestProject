package testone;

public class TestGenericGet {
private Object x;
private Object y;
	public void SetX(Object x){
		this.x=x;
	}
	public void SetY(Object y){
		this.y=y;
	}
	public Object GetX() {
		return x;
	}
	public Object GetY() {
		return y;
	}
	
}

class Point<T>{
	private T x;
	private int a;
	public void SetX(T x) {
		this.x=x;
	}
	public T GetX() {
		return x;
	}
	public void SetA(int a) {
		this.a=a;
	}
	public int GetA() {
		return a;
	}
	
}

