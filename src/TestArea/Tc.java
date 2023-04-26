package TestArea;

import java.util.HashMap;

public class Tc {

	public static void main(String[] args) {
		int[] list = {2,6,7,16};
		
		for(int i : twoSum(list, 23)) {
			System.out.println(i);
		}
	}
	
	public static String twosumMing(){
		int[] list = {2, 7, 11, 15};	// N(N-1)/2次		
		int target = 9, sum;
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for(int i=0 ; i<list.length ; i++) {
			for(int j=0 ; j<list.length ; j++) {
				if(i == j) continue;
				sum = list[i] + list[j];
				String resi = String.valueOf(list[i]); String resj = String.valueOf(list[j]);
				map.put(sum, resi+ "+" +resj);
			}			
		}		
		return map.get(target);
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index;
                result[1] = i;
                return result;
            } else {
                map.put(target - numbers[i], i);
                System.out.println("map.put"+String.valueOf(target) + "-" + String.valueOf(numbers[i]) + "," + i);
            }
            System.out.println(map);
        }
        return result;
    }

}
