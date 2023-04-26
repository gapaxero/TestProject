package TestArea;

import java.io.UnsupportedEncodingException;

public class T5S {
public static final int REMARK = 38;
public static final String REMARK_MSG = "附言" + "AA";

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "0000000000000000000000000000000";
		String s = "我000";
		System.out.println(str.length());
		System.out.println("len:" + s.length() + " bytes:" + s.getBytes("UTF-8").length);
		System.out.println(checkREMARK(s));
		
	}
	
	

		
	public static boolean checkREMARK(String str) {
		try {
			return str.length() <= REMARK && str.getBytes("UTF-8").length <= (REMARK * 3)
					&& str.getBytes("UTF-8").length % 3 == 0;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
