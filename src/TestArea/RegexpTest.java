package TestArea;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;
import java.util.regex.Pattern;

import lombok.ToString;

public class RegexpTest {
public static final LocalDateTime localnow = LocalDateTime.now();

public static final Pattern description  = Pattern.compile("[\u4e00-\u9fa5]{1,4}");
public static final Pattern description2 = Pattern.compile("^[A-Za-z0-9]");
public static final Pattern descriptionN = Pattern.compile("[0-9]+");
public static final Pattern description4 = Pattern.compile("0|1|2");
public static final Pattern description3 = Pattern.compile("[\u4e00-\u9fa5a-zA-Z0-9]{1,4}");
public static final Pattern description5 = Pattern.compile("[\\u4e00-\\u9fa5\\uFF10-\\uFF19\\uFF41-\\uFF5A\\uFF21-\\uFF3A\u3000]{4}");
public static final Pattern descriptionSpace = Pattern.compile("[\\p{IsWhite_Space}]");
public static final Pattern SidPattern = Pattern.compile("^\\w{11}$");
	public static void main(String[] args) {
		String aaa = "T123772222"; String a = "";
		
		if(SidPattern.matcher(aaa).matches()) {
			System.out.println(aaa+" 格式正確");
		}else {
			System.out.println(aaa+" 格式錯誤");
		}
		Scanner sc =new Scanner(System.in);
		
//		while(true) {
//			String a =sc.next();
//			if( a.equals("stop")  ) {
//				System.out.println("停止程式");
//				sc.close();
//				break;
////				else if(!descriptionN.matcher(at).matches() && !description2.matcher(at).matches() && a.length() != 9)
//			}else if(description5.matcher(a).matches()) {
//				System.out.println("格式正確");
//			}
//			
//			else {
//				System.out.println("格式錯誤");
//			}
//			
//		}
		
	}
	
	public static String createUUID() {
		UUID uuid = UUID.randomUUID();
		String a = uuid.toString().replace("-", "");
		return a;
	}
	
	public static String getDate_yyyyMMddHHmmssSSS(){
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		Date date = new Date();
		String strDate = sdFormat.format(date);
		return strDate;
	}

}
