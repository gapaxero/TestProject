package TestArea;

public class TT {

	public static void main(String[] args) {
		String a = "123 456 789";
		
		String[] list = a.split(" ");
		
		for(String i : list) {
			System.out.println(i);
		}

	}

}
