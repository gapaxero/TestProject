package TestArea;

import java.time.LocalDate;

public class testDate {

	public static void main(String[] args) {
		String sDate = "2020/12/31";
		String eDate = "2022/01/01";
		String N = "";
		String R = "2";
		
//		System.out.println(MorethanOneYear(sDate, eDate));
		
		System.out.println(TMorethanOneYear(sDate, eDate));
		
		if(!TMorethanOneYear(sDate, eDate)) {
			N = "1: 40";
		}else if(TMorethanOneYear(sDate, eDate) && R.equals("1")) {
			N = "2: 60";
		}else if(TMorethanOneYear(sDate, eDate) && R.equals("2")) {
			N = "3: 70";
		}
		System.out.println(N);
	}
	
	public static boolean TMorethanOneYear(String sDate, String eDate) {
		boolean flag = false;
		LocalDate dStart = LocalDate.parse(sDate.replace("/", "-")).plusYears(1);
		LocalDate dEnd = LocalDate.parse(eDate.replace("/", "-"));
		
		if(dEnd.isAfter(dStart) || dEnd.isEqual(dStart)) {
			flag = true;
		}else {
			flag = false;
		}
						
		return flag;
	}
	
	public static boolean MorethanOneYear(String sDate, String eDate) {
		boolean flag = false;
		LocalDate Odate = LocalDate.parse(sDate.replace("/", "-")).plusYears(1);
		LocalDate dStart = LocalDate.parse(sDate.replace("/", "-")).plusYears(1);
		LocalDate dEnd = LocalDate.parse(eDate.replace("/", "-"));
		System.out.println("ds: "+dStart);
		System.out.println("de: "+dEnd);
		if(!"02/29".equals(sDate.substring(5, sDate.length()))){
			if(dStart.isAfter(dEnd) || dStart.isEqual(dEnd)) {
				flag = true;
			}else if(dStart.isBefore(dEnd)){
				flag = false;
			}
		}else {
			if(dEnd.isAfter(dStart)) {
				
			}
		}
		
		
		return flag;
	}

}
