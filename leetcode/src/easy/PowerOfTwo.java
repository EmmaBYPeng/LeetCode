package easy;

public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		if (n == 0) {
			return false;
		} else if (n == 1) {
        	return true;
        } else if (n % 2 != 0) { 
        	return false;
        } else {
        	return isPowerOfTwo(n/2);
        }
    }
}
