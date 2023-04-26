package testarray;

import java.time.LocalDate;

public class TestDate {

	public static void main(String[] args) {
		String sDate = "2021/08/13";
		String eDate = "2024/09/12";
		String sAccOutAmount = "10000";
		
		if(Integer.valueOf(sAccOutAmount) < 10000) {
			System.out.println("error");
		}else {
			System.out.println("T");
		}
		
	}
	
	public static boolean FDThreeYearChecker(String sDate, String eDate) {
		boolean flag = false;
		LocalDate dStart = LocalDate.parse(sDate.replace("/", "-")).plusYears(3).plusMonths(1);
		LocalDate dEnd = LocalDate.parse(eDate.replace("/", "-"));
		
		if(dEnd.isAfter(dStart) || dEnd.isEqual(dStart)) {
			flag = true;
		}else {
			flag = false;
		}
						
		return flag;
	}
	
	public static boolean FDYearInterChecker(String sDate, String eDate, int Y,int M) {
		boolean flag = false;
		LocalDate dStart = LocalDate.parse(sDate.replace("/", "-")).plusYears(Y).plusMonths(M);
		LocalDate dEnd = LocalDate.parse(eDate.replace("/", "-"));
		
		if(dEnd.isAfter(dStart) || dEnd.isEqual(dStart)) {
			flag = true;
		}else {
			flag = false;
		}
						
		return flag;
	}

}
