package easy;

public class Intersection {
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
		while (length(headA) > length(headB)) {
			headA = headA.next;
		}
		
		while (length(headB) > length(headA)) {
			headB = headB.next;
		}
		
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		
		return headA;
		
		
    }
	
	public int length(ListNode head) {
		int length = 0;
		
		while (head != null) {
			length++;
			head = head.next;
		}
		
		return length;
	}

}
