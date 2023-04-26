package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlusOne {

	public static void main(String[] args) {
		int[] i = {9,8,7,6,5,4,3,2,9,9};
		int[] ii = {9};
		
		for(int a : plusOne(ii)) {
			System.out.println(a);
		}

	}
	
	public static int[] plusOne(int[] digits) {
		List<Integer> list = Arrays.stream(digits).boxed().collect(Collectors.toList());		
		int index = 0;
		
		if(list.size() != 1) {
			index = list.size()-1;
		}
              
        while(true) {
        	
        	if(index < 0) {
        		list.add(0,1);
        		break;
        	}
        	
        	if(list.get(index) == 9) {
        		list.set(index, 0);
        		index--;
        	}else {
            	list.set(index, list.get(index)+1);
            	break;
            }
        }
        
        int[] res = list.stream().mapToInt(i -> i).toArray();       
        
		return res;
    }
	
//	public static int[] plusOne(int[] digits) {
//        ArrayList<Integer> res = new ArrayList<Integer>();
//		String temp = "";
//		
//        for(int i : digits) {
//        	temp += String.valueOf(i); 
//        }
//        
//        temp = String.valueOf(Integer.valueOf(temp) + 1) ;
//		
//        for(int j = 0 ; j < temp.length() ; j++) {
//        	res.add(Character.getNumericValue(temp.charAt(j)));
//        }
//        
//		return res.stream().mapToInt(i -> i).toArray();
//    }

}
