package easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
       
    	int count = digits.length;
    	
    	if (count == 0) {
    		int[] digitsNew = {0};
    		return digitsNew;
    	} else {
    		if (digits[count-1] == 9) {
    			if (count == 1) {
    				int[] array = {1, 0};
    				return array;
    			} else {
    				int[] sub = plusOne(Arrays.copyOfRange(digits, 0, count-1));
    				return Arrays.copyOf(sub, sub.length+1);
    			}
    		} else {
    			digits[count-1]++;
    			return digits;
    		}
    	}
    }
    
    public final void printArray(int[] array) {
    	for (int elem : array) {
    		System.out.print(elem + " ");
    	}
    	System.out.println();
    }
}
