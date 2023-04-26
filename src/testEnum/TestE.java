package testEnum;

public enum TestE {
	 AAA(123,"A000")
	,BBB(456,"B000")
	,CCC(789,"C000");
	
	final int path;
	String name = "";
	
	TestE(int path,String name){
		this.path = path;
		this.name = name;
	}
	public int getPath() {
		return path;
	}
	public String getName() {
		return name;
	}
}
