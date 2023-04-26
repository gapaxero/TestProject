package testdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestCompare {
static Date dNowDate 	= null;
static Date dSDate 		= null;
	public static void main(String[] args) throws ParseException {
		String sSDate = "2021/10/07";
		String sNowDate = "";
		sNowDate = getDate_yyyyMMdd();
		dNowDate = getDate_yyyyMMdd(sNowDate);
		dSDate	 = getDate_yyyyMMdd(sSDate);
		
		System.out.println("sSDate: "+sSDate);
		System.out.println("sNowDate: "+sNowDate);
		
		if(sSDate.equals(sNowDate)) {
			System.out.println("正常情況");
		}
		else if(dSDate.before(dNowDate)) {
			System.out.println("逾期交易");
		}
		else if(dSDate.after(dNowDate)) {
			System.out.println("尚未到交易日");
		}

	}
	
	public static String getDate_yyyyMMdd(){
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String strDate = sdFormat.format(date);
		return strDate;
	}
	
	public static Date getDate_yyyyMMdd(String date) throws ParseException {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
		return sdFormat.parse(date);
	}
}
