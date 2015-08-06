package easy;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = toArrayList(head);
        
        return palindrome(list);
    }
	
	public boolean palindrome(List<Integer> list) {
		if (list.size() <= 1) return true;
        if (list.size() == 2) {
        	System.out.println(list.get(0).intValue() + " " + list.get(1));
        	if (list.get(0).intValue() == list.get(1).intValue()) {
        		return true;
        	} else {
        		return false;
        	}
        }
        
        System.out.println("List: ");
        list.forEach(elem -> System.out.print(elem));
        System.out.println();
        System.out.println("Sub List: ");
        list.subList(1, list.size()-1).forEach(elem -> System.out.print(elem+" "));
        System.out.println();
        
        return (list.get(0).intValue() == list.get(list.size()-1).intValue()) && palindrome(list.subList(1, list.size()-1));
	}
	
	public ArrayList<Integer> toArrayList(ListNode head) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (head == null) return list;
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		return list;
	}
}
