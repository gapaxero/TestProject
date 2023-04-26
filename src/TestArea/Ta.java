package TestArea;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import testStatic.Test1;

public class Ta {

	public static void main(String[] args) throws Exception {
		String a = String.format("%.3f",Double.valueOf("00.810"));
		double b = 0.810;
		String c = new String("3"); String c2 = new String("3");
		String m = "01101019";
		String m2 = "0000000002134.12";
		
		
	}
	
	public static String MoneyFormat4Double(String data,String pattern) {
		if(data == null || data == "")
			return "";
		
		data = data.trim().replaceAll("[!@#$%^&*(),?\":{}|<>]", "");
		
		double num = 0;
		try {
			num = Double.parseDouble(data);
		}catch(NumberFormatException e) {
			return "0";
		}
		
		return new DecimalFormat(pattern,new DecimalFormatSymbols(Locale.TAIWAN)).format(num);
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
	
	public static String formatFAmount13(String amount) {
//		amount = amount.substring(0, 13) + "." + amount.substring(13, amount.length());
		return String.format("%.2f", Double.valueOf(formatDecimalPoint(amount)));
	}
	public static String formatDecimalPoint(String amount) {
		int iLen = amount.length();
		return String.format("%s.%s"
				, amount.substring(0, iLen-2)
				, amount.substring(iLen-2)
				);
	}
	
	public static String switchGetRateTypeNTList(String g) {
		if(g.equals("2")) {
			g = "每月領息";
		}else if(g.equals("1")) {
			g = "到期領息";
		}return g;
	}
	
	public static String getAmountNOZero(String amount) {
		String amt = String.valueOf(Integer.valueOf(amount));
		return amt;
	}
	
	public static String MoneyFormat4Double(String data,int format) {
		if(data == null || data == "")
			return "";
		
		data = data.trim().replaceAll("[!@#$%^&*(),.?\":{}|<>]", "");
		
		double num = 0;
		try {
			num = Double.parseDouble(data);
			if(num == 0.0)
				return "0.0";
		}catch(NumberFormatException e) {
			return "0.0";
		}
		
		int pa = format;
		int div = 1;
		if(pa < 0) {
			for(int i = 0; i > pa; i--) {
				div = div * 10;
			}
			num = num / div;
		}else if(pa > 0){
			for(int i = 0; i < pa; i++) {
				div = div * 10;
			}
			num = num * div;
		}
		
		return new DecimalFormat("0.00",new DecimalFormatSymbols(Locale.TAIWAN)).format(num);
	}

}
