package easy;

public class PalInt {
	 public boolean isPalindrome(int x) {
		 if (x < 0) return false;
		 
		 int y = x;
		 int num = 0;
		
		 while (x > 0) {
			 int remainder = x % 10;
			 num = num*10 + remainder;
			 x /= 10;
		 }
		 
		 return (y == num);
	 }
}
