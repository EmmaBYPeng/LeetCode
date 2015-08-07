# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} p
    # @param {TreeNode} q
    # @return {boolean}
    def isSameTree(self, p, q):
        if (p == None and q == None):
            return True
            
        if (p != None and q != None):
            if (p.val != q.val):
                return False
            else:
                return self.isSameTree(p.right, q.right) and self.isSameTree(p.left, q.left)
        else:
            return False
