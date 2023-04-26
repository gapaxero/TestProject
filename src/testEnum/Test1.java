package testEnum;

public class Test1 {
	public static void main(String[] args) {
		String res1 = getData(TestE.AAA);
		String res2 = getData(TestE.BBB);
		String res3 = getData(TestE.CCC);

		String test = "AAA";

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);

	}

	public static boolean getEData(TestE testE) {

		return TestE.AAA.equals(testE) || TestE.BBB.equals(testE);

	}

	public static String getData(TestE e) {
		int resP = e.getPath();
		String resN = e.getName();
		return resP + " " + resN;
	}
}
