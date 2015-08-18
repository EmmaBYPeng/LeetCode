package easy;

import util.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class ReverseLL {
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode fst = head;
        ListNode snd = head.next;
        fst.next = null;
        
        while (snd != null) {
        	ListNode temp = snd.next;
        	snd.next = fst;
        	fst = snd;
        	snd = temp;
        }
        
        return fst;
    }
}
