package testregexp;

import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Test1 {
public static final String specialWord = "^!@#$%^&*()_\\-=+{};':\",.\\/<>?\\[\\]`~ ";
public static final String unSpecialWord = "^[!@#$%^&*()_\\-=+{};':\",.\\/<>?\\[\\]`~ ]";

private static final Pattern nation = Pattern.compile("^.{1,100}$"); 
private static final Pattern descriptionN = Pattern.compile("^[1-9]$");
private static final Pattern sid = Pattern.compile("^\\w{11}$");
private static final Pattern birthdate = Pattern.compile("^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$");
private static final Pattern cName = Pattern.compile("^[" + specialWord + "0-9A-Za-z]{0,25}$");
private static final Pattern eName = Pattern.compile("^[A-Z ]{1,25}$");
private static final Pattern moblie = Pattern.compile("^09\\d{8}$");
private static final Pattern tel = Pattern.compile("^[0-9]{0,10}$");
private static final Pattern telT = Pattern.compile("^0[1-8][0-9]{0,8}$");
private static final Pattern phone = Pattern.compile("^09\\d{8}$|^0[1-8]\\d{8}$");
private static final Pattern nationO = Pattern.compile("(^[A-Z]{0,10}$)?");
private static final Pattern sex = Pattern.compile("^F$|^M$");
private static final Pattern yyyyMMdd = Pattern.compile("^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$");
private static final Pattern fType = Pattern.compile("^BankBook$|^PaySheet$|^AppointmentCert$|^EmployeeCard$|^TaxStatement$|^Contract$");
private static final Pattern cBRPO = Pattern.compile(unSpecialWord + "{0,50}$");
private static final Pattern cBRPOEUI = Pattern.compile("^.{0,100}$");
private static final Pattern fTEst = Pattern.compile("^\\d{1,2}$");
private static final Pattern ent = Pattern.compile("^FTAO|FUNDAO$");
private static final Pattern base64 = Pattern.compile("(^[a-zA-Z0-9\\/+=]*.$)?");
private static final Pattern pum = Pattern.compile("^[0-9A-Za-z]{1,30}$");


	public static void main(String[] args) {
		String cname = "我";
		String ename = "บริการส่วนบุคคล ( พยาบาล,แม่บ้าน,พี่เลี้ยงเด็ก อื่นๆ )";
		String testStr = "";
		String name = "HOANG THI PHUONG HOA";

//		System.out.println(cname.getBytes(StandardCharsets.UTF_8).length);
		System.out.println(checkPattern(cName, cname));

	}
	
	private static boolean checkPattern(Pattern pattern,String input) {
		return pattern.matcher(input).matches();
	}
	
	private static void checkFType(Pattern pattern, String... type) {
		List<String> list = new ArrayList<>();
		for(String i : type) {
			list.add(i);
		}
		
		for(String j : list) {
			System.out.println(j);
			System.out.println(checkPattern(pattern, j));
		}
		
	}
	
}

/*
泰文　  บริการส่วนบุคคล ( พยาบาล,แม่บ้าน,พี่เลี้ยงเด็ก อื่นๆ )
印尼文　Layanan pribadi (keperawatan, pembantu, babysitter, dll.)
越南文　Dịch vụ cá nhân (khán hộ, giúp việc, trông trẻ, v.v.)
英文　  Personal services (nursing, maids, babysitters, etc.)
*/