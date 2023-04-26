package leetcode.easy;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1100";
		String b = "11";
		
		System.out.println(ming(a, b));

	}
	
	public static String ming(String a,String b) {
		String res = "";
		StringBuilder temp = new StringBuilder("");
		
		int indexA = a.length()-1;
		int indexB = b.length()-1;
		int in = 0;
		
		while(indexA >= 0 || indexB >= 0) {
			int sum = in;
			
			if(indexA >= 0 ) sum += a.charAt(indexA) - '0';
			if(indexB >= 0 ) sum += b.charAt(indexB) - '0';
			
			indexA--;
			indexB--;
			
			temp.append(sum%2);
			in = sum/2;
		}
		
		if(in!=0) temp.append("1");
		res = temp.reverse().toString();
		
		return res;
	}

}
