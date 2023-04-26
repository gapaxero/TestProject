package testcast;

public class human implements swimmer{
private String name;
	public human(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	@Override
	public void swim() {
		System.out.println(name+": "+"自由式");
	}
	
}
