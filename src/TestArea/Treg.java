package TestArea;

public class Treg {

	public static void main(String[] args) {
		String Nick = "abCC131";
		if(isContainEng(Nick)||isContainNum(Nick))
			System.out.println("TTT");
		else {
			System.out.println("FFF");
		}

	}
	
	public static boolean isContainEng(String input) {
		return input.matches("^[a-zA-Z]+$");
	}

	public static boolean isContainNum(String input) {
		return input.matches("^[0-9]+$");
	}
	

}
