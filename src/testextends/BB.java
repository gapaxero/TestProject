package testextends;

public class BB extends AA {
	public int b = 55;

	@Override
	public void methodAA() {
		super.methodAA();
		System.out.println("BB的複寫MAA");
	}

	@Override
	public void methodBB() {
		System.out.println("BB的複寫MBB");
	}

}
