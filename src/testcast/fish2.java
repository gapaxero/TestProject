package testcast;

public class fish2 extends fish{

	public fish2(String name) {
		super(name);
	}
	@Override
	public void swim() {
		System.out.println(name+": "+"向後游");
	}
	

}
