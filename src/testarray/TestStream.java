package testarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		List<FStype>  typeList  = new ArrayList<FStype>();
		List<String>  ImageList = new ArrayList<String>();
		List<Integer> size      = new ArrayList<Integer>();
		Map<FStype, String> map = new TreeMap<FStype, String>();
		
		typeList.add(FStype.valueOf("PaySheet")); typeList.add(FStype.valueOf("EmployeeCard")); typeList.add(FStype.valueOf("Contract"));
		ImageList.add("財力證明11"); ImageList.add("財力證明222"); ImageList.add("財力證明3333");		
		
		for(int i = 0 ; i < typeList.size() ; i++) {
			map.put(typeList.get(i), ImageList.get(i));
			size.add(ImageList.get(i).length());
		}
		
		
		
		System.out.println(map);
		System.out.println(size);

	}
	
	private static boolean doSizeFilter(String image) {
		return image.length() <= 10 ? true : false;
	}
	
	private static boolean doImageNullChecker(String image) {
		return (image == null || image.length() == 0) ? true : false;
	}

}
