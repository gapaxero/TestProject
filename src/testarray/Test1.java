package testarray;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		String reqmodel = "EE,BB,CC,DD,EE";
		String namess = "a,b,c";
		String multinames = "";
		List<String> multiNames = Arrays.asList(reqmodel.split(","));
		List<String> names = Arrays.asList(reqmodel.split(","));
		List<FSType> reqmodellist = new ArrayList<>();
		String[] stlist = {"aa","bb","cc","dd","ee"};

		for (String s : reqmodel.split(",")) {
			reqmodellist.add(FSType.valueOf(s));
		}

//		reqmodellist.add(FSType.valueOf("AA"));
		System.out.println(Arrays.toString(namess.split(",")));
		System.out.println(Arrays.toString(multinames.split(",")));

	}

	
	private static boolean checkData(String input) {
		boolean res = false;
		
		if(input.length() <= 3) res = true;
		
		return res;
	}

	public enum FSType {

		AA,BB,CC,DD,EE

	}
	
}
