package easy;

import java.util.Stack;

public class BinaryAdd {

	// Memory limit exceed!
	public String addBinary(String a, String b) {
    
		if (a == "") return b;
		if (b == "") return a;
		
		char[] array1 = a.toCharArray();
		char[] array2 = b.toCharArray();
		
		int num1 = toDecimal(array1);
		int num2 = toDecimal(array2);
		
		int num = num1 + num2;
		return toBinary(num);
    }
	
	public int toDecimal(char[] array) {
		int num = 0;
		int len = array.length;
		
		for (int i = len-1; i >= 0; i--) {
			num += (array[i] - 48) * Math.pow(2, len-i-1);
		}
		
		return num;
	}
	
	public String toBinary(int num) {
		String s = "";
		Stack<String> stack = new Stack<String>();
		
		if (num == 0) return "0";
		
		while (num != 0) {
			Integer remainder = num % 2;
			num /= 2;
			stack.push(remainder.toString());
		}
		
		while (!stack.isEmpty()) {
			String digit = stack.pop();
			s += digit;
		}
		
		return s;
	}

}
