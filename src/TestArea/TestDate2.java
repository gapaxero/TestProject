package TestArea;

public class TestDate2 {

	public static void main(String[] args) {
		try {
			System.out.println(getDate_CD2AD(null));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getDate_CD2AD(String sRepublic0yyy) throws Exception {
		String strDate = "";
		int cYYYY = 0;
		switch(sRepublic0yyy.length()) {
		case 8: 
			cYYYY = Integer.valueOf(sRepublic0yyy.substring(1, 4)) + 1911;
			strDate = String.valueOf(cYYYY) + "/" + sRepublic0yyy.substring(4, 6) + "/" + sRepublic0yyy.substring(6, 8);
			break;
		case 7: cYYYY = Integer.valueOf(sRepublic0yyy.substring(0, 3)) + 1911;
		strDate = String.valueOf(cYYYY) + "/" + sRepublic0yyy.substring(3, 5) + "/" + sRepublic0yyy.substring(5, 7);
			break;
		case 6: 
			int iYY = Integer.valueOf(sRepublic0yyy.substring(0, 2));
			
			if((99 >= iYY) && (iYY >= 50))
				cYYYY = iYY + 1911;
			else
				cYYYY = 100 + iYY + 1911;
			strDate = String.valueOf(cYYYY) + "/" + sRepublic0yyy.substring(2, 4) + "/" + sRepublic0yyy.substring(4, 6);
			break;
		default:
			throw new Exception("DATE ERROR");
		}
		return strDate;
	}

}
