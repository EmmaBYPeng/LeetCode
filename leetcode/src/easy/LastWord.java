package easy;

import java.util.ArrayList;
import java.util.List;

public class LastWord {
	
	public int lengthOfLastWord3 (String s) {
		char[] sentence = s.toCharArray();
		List<Character> word = new ArrayList<Character>();
		
		if (s.isEmpty()) return 0;
		
		for (int i = s.length()-1; i >= 0; i--) {
			if (sentence[i] != ' ') {
				word.add(sentence[i]);
			} else if (word.size() > 0) {
				break;
			}
		}
		
		return word.size();
	}
	
	public int lengthOfLastWord2 (String s) {
		int size, start, end;
		char[] sentence = s.toCharArray();
		
		if (s.isEmpty()) return 0;
		
		size = s.length();
		end = start = size;
		
		for (int i = size-1; i >= 0; i--) {
			if (sentence[i] == ' ') {
				if (start == end) {
					start--;
					end--;
				} else {
					break;
				}
			} else {
				start--;
			}
		}
		
		return end - start;
	}

	public int lengthOfLastWord(String s) {
        ArrayList<Integer> indices = indexOfWhiteSpaces(s);
        
        return compare(s, indices);
    }
	
	public int compare(String s, ArrayList<Integer> indices) {
		if (s.isEmpty()) return 0;
		
		int size = indices.size();
		int lastIndex = indices.get(size-1);
		
		if (lastIndex < s.length() - 1) {
			return s.length() - lastIndex - 1;
		} else {
			indices.remove(size-1);
			return compare(s.substring(0, s.length()-1), indices);
		}
	}
	
	public ArrayList<Integer> indexOfWhiteSpaces(String s) {
		ArrayList<Integer> indices = new ArrayList<Integer>();
		indices.add(-1);
		
		char[] sentence = s.toCharArray();
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i] == ' ') indices.add(i);
		}
		
		return indices;
	}
}
