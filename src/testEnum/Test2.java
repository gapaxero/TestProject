package testEnum;

public class Test2 {
	public static void main(String args[]) {
		OldStudent.assignGrade(OldGrade.A); //正確傳入
//		OldStudent.assignGrade(OldClass.ENGLISH); //錯誤傳入，難以檢查
		
		NewStudent.assignGrade(NewGrade.A); //正確傳入
//		NewStudent.assignGrade(NewClass.ENGLISH); //錯誤傳入，容易檢查
	}
	
	public class OldGrade {
	    public static final int A = 1;
	    //以下略……
	}

	public class OldClass {
	    public static final int English = 1;
	    //以下略……
	}

	public static class OldStudent {
	    public static void assignGrade(int grade) {
	        //以下略……
	    }
	}
	
	public enum NewGrade {
	    A, B, C, D, F, INCOMPLETE
	}

	public enum NewClass {
	    ENGLISH, MATH
	}

	public static class NewStudent {
	    public static void assignGrade(NewGrade grade) {
	         //以下略……
	    }
	}
}
