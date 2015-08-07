# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param {ListNode} head
    # @param {integer} val
    # @return {ListNode}
    def removeElements(self, head, val):
        if head == None: 
            return head
        
        while head != None and head.val == val:
            head = head.next
        
        if head == None:
            return head
            
        node1 = head
        node2 = head.next
        
        while node2 != None:
            if node2.val == val:
                node2 = node2.next
                node1.next = node2
            else:
                node1 = node2
                node2 = node2.next
                
        return head
