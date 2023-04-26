package testCon;

public class MainTest {

	public static void main(String[] args) {
		HumanVO hv1 = new HumanVO();
		System.out.println(hv1.toString());
		HumanVO hv2 = new HumanVO("AAA");
		System.out.println(hv2.toString());
		HumanVO hv3 = new HumanVO("BBB",25,"Taipei");
		System.out.println(hv3.toString());
		
	}

}
