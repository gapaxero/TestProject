package leetcode.easy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;


public class ValidParentheses {

	public static void main(String[] args) {
		String s1 = "))";
//		String s2 = "){";
//		String s3 = "()[]{}";
		
		System.out.println(ming(s1));
//		System.out.println(ming(s2));
//		System.out.println(ming(s3));
		
	}
	
	// 合法括號 '(' , ')' , '{' , '}' , '[' , ']'
	public static boolean ming(String s) {
		boolean res = false;
				
		Stack<String> stack = new Stack<String>();
		String temp = "";
		
		if(s.length() % 2 == 0) {
			for(int i = 0 ; i < s.length() ; i++) {
				temp = String.valueOf(s.charAt(i));
				// "))"
				if (temp.equals("(") || temp.equals("[") || temp.equals("{")) {					
					stack.push(temp);
				}else {
					if(stack.empty()) {						
						return false;
					}else if (temp.equals(")") && stack.peek().equals("(")) {
						stack.pop();
					}else if (temp.equals("]") && stack.peek().equals("[")) {
						stack.pop();				
					}else if (temp.equals("}") && stack.peek().equals("{")) {
						stack.pop();
					}else {
						stack.push(temp);
					}
				}							
			}
		}else {
			return false;
		}			
		
		System.out.println(stack);
		if(stack.empty())res = true;
		
		return res;
	}
}
