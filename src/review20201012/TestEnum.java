package review20201012;

public class TestEnum {
public static int number =10;

	public static void main(String[] args) {	
		TestData a=TestData.B;
		DO(a);
		System.out.println("============");
		DO(TestData.C);
		
	}

	public static void DO(TestData Data) {
		Data.AA();Data.BB();Data.sw();
		switch(Data) {
		case A:System.out.println("A");break;
		case B:System.out.println("B");break;
		case C:System.out.println("C");break;
		case D:System.out.println("D");break;
		}
		
	}


}
