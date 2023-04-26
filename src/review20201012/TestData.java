package review20201012;

public enum TestData {
	A,B,C,D;
	
	public void AA(){
		System.out.println("test1");
	}
	public void BB(){
		System.out.println("test2");
	}
	public void sw() {
		switch (TestData.A) {
		case A:
			System.out.println("aaa");break;
		default:System.out.println("DD");
			break;
		}
	}
}
