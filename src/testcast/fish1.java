package testcast;

public class fish1 extends fish{
	public fish1(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println(name+": "+"向前游");
	}
	

}
