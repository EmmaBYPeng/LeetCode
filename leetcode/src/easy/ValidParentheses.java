package easy;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
		char[] string = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		
		for (int i = string.length-1; i >= 0; i--) {
			stack.push(string[i]);
		}
		
		if (stack.isEmpty()) return true;
		
		while (!stack.isEmpty()) {
			char x = stack.pop();
		
			if (x == '(' || x == '[' || x == '{') {
				stack2.push(x);
			} 
			
			if (x == ')') {
				if (!stack2.empty() && stack2.peek() == '(') {
					stack2.pop();
				} else {
					return false;
				}
			}
			
			if (x == ']') {
				if (!stack2.empty() && stack2.peek() == '[') {
					stack2.pop();
				} else {
					return false;
				}
			}
			
			if (x == '}') {
				if (!stack2.empty() && stack2.peek() == '{') {
					stack2.pop();
				} else {
					return false;
				}
			}
		}
		
		if (stack2.isEmpty()) return true;
		return false;
    } 
}
