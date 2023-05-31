package testCon;

public class HumanVO {
	public String name = "";
	public int age;
	public String home = "";
	static int counter;
	
	public HumanVO() {
		this.name = "Null";
		this.home = "default";
		this.age = -1;
		counter++;
	}
	
	public HumanVO(String name) {
		this();
		this.name = name;
		
	}
		
	public HumanVO(String name, int age, String home) {
		this(name);
		this.age = age;
		this.home = home;
	}

	public HumanVO getHumanVO() {
		return this;
	}

	public Object getReturn() {
		return 1;
	}

	@Override
	public String toString() {
		return "Name:" + name + " Age:" + age + " Home:" + home + " Counter:" + counter;
	}
	
}
