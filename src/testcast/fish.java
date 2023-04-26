package testcast;

public abstract class fish implements swimmer{
public String name;
	public fish(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}


	public abstract void swim();

}
