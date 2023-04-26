package TestArea;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



public class TestDo {
	public static final Pattern DESCRIPTION = Pattern.compile("[\u4e00-\u9fa5\uFF10-\uFF19\uFF41-\uFF5A\uFF21-\uFF3A\u3000]{4}");
	public static final Pattern bankremark = Pattern.compile("[\\u4e00-\\u9fa5\\uFF10-\\uFF19\\uFF41-\\uFF5A\\uFF21-\\uFF3A\\u3000\\d\\w]{1,10}");
	public static final Pattern AcctID = Pattern.compile("\\w{10,11}$");// 身分證10	
	public static final Pattern CID = Pattern.compile("\\w{8,9}|\\w{10,11}");// 統編8 身分證10
	
	public static void main(String[] args) throws Exception {	
		String sDate = "2021/09/01";
		String eDate = "2024/09/02";
		String m = "5"; String m2 = "1,0,,,00";
		String a = "WSBR2071A";
//		System.out.println(String.format("%.3f", Double.valueOf(m)));
		
		System.out.println(CID.matcher(a).matches());
		
	}
	
	public static String getDefaultNowDateTime() {
		try {
			return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));	
		} catch (DateTimeParseException e) {
			return e.toString();
		}
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
	
	
	public static String setDataZero(String data,int a) {
		String d = data;

		do{
			System.out.println(d.length());
			d = "0" + d;
		}while(d.length() < a);
		
		return d;
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
