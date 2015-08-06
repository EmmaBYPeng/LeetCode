package easy;

import java.util.Stack;

public class ValidString {

	public boolean isValid(String s) {
		char[] string = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < string.length; i++) {
			stack.push(string[i]);
		}
		
		 
		
    } 
}
