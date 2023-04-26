package TestArea;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

import testStatic.Test1;

public class TTT{
public static String DateTimeHyphen="yyyy-MM-dd HH:mm:ss";
	public static void main(String[] args) {
		String a = getDefaultNowDateTime().substring(0, 10).replace("-", "/");
		String t = "SC030603004DO";
		System.out.println(a);
		
		
	}
	
	public static String getYesyterDate(String date) {
		try {
			LocalDate datetime = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
			return datetime.plusDays(-1).format(DateTimeFormatter.ofPattern("yyyy/MM/dd")).toString();
		} catch (DateTimeParseException e) {
			return e.toString();
		}
	}
	
	public static String getDefaultNowDateTime() {
		try {
			return LocalDateTime.now().format(DateTimeFormatter.ofPattern(DateTimeHyphen));	
		} catch (DateTimeParseException e) {
			return e.toString();
		}
	}
	
	public static String dateTrim1(String date) {
		String res =   date.substring(0, 4) + "/"
				     + date.substring(4, 6) + "/"
				     + date.substring(6, 8);		
		return res;
	}
	
	public static String apinametool (String sid) {
		String res = "";
		
		switch (sid) {
		
			case "SC030101002DO" : res = "sc01"; break; //台幣單筆    
			case "SC030102002DO" : res = "sc02"; break; //台幣整批    
			case "SC030201002DO" : res = "sc03"; break; //薪轉        
			case "SC030501002DO" : res = "sc04"; break; //外幣單筆    
			case "SC030503002DO" : res = "sc05"; break; //外幣匯出匯款
			case "SC030504002DO" : res = "sc06"; break; //外幣結匯(外轉台、台轉外、幣轉)
			case "SC030601002DO" : res = "sc07"; break; //台幣綜存    
			case "SC030603004DO" : res = "sc08"; break; //台幣定存解約
			case "SC030701002DO" : res = "sc09"; break; //外幣綜存    
			case "SC030703004DO" : res = "sc10"; break; //外幣定存解約
			case "SC050201002DO" : res = "sc11"; break; //基金申      
			case "SC050203004DO" : res = "sc12"; break; //基金轉      
			case "SC050202003DO" : res = "sc13"; break; //基金贖      

			default: res = "non"; break;
			
		}
		
		return res;
	}
}
