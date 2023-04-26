package testextends;

public class Test {

	public static void main(String[] args) {
		AA x = new AA();
		AA y = new BB();// 多型
		BB z = new BB();
		System.out.println("========");
		z.methodAA();
		z.methodBB();
		System.out.println("========");
		x.methodAA();
		x.methodBB();
		System.out.println("========");
		y.methodAA();
		y.methodBB();
		if (z instanceof AA) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
