package easy;

import util.ListNode;

public class RemoveNode {

	public ListNode removeElements(ListNode head, int val) {
    
		if (head == null) return head;
		
		while (head != null && head.val == val) head = head.next;
		
		if (head == null) return head;
		
		ListNode node1 = head;
		ListNode node2 = head.next;
		
		while (node2 != null) {
			if (node2.val == val) {
				node2 = node2.next;
				node1.next = node2;
			} else {
				node1 = node2;
				node2 = node2.next;
			}
		}
		
		return head;
		
    }
}
