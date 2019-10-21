#
# @lc app=leetcode id=21 lang=python3
#
# [21] Merge Two Sorted Lists
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
# these two are linked lists not array and they are not iterable
# so we cannot use the for loop and we have to get the value by using .next
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        # the edge cases:
        if l1 is None:
            return l2
        elif l2 is None:
            return l1
        
        elif l1.val <l2.val:
            l1.next = self.mergeTwoLists(l1.next,l2) # recursively merge
            return l1
        
        else:
            l2.next = self.mergeTwoLists(l1, l2.next)

    def mergeTwoLists2 (self, l1: ListNode, l2: ListNode) ->ListNode:
        # set a reference of the node which will not change named prev 
        prev = ListNode(0)
        head = prev
        
        while l1 and l2:
            if l1.val<=l2.val:
                head.next=l1 # the next node of head is node in l1
                l1 = l1.next
            else:
                head.next=l2 # the next node is node in l2
                l2= l2.next
            
            head = head.next  # append node and move to next

        if l1 is None and l2 is not None:
            head.next = l2
        elif l1 is not None and l2 is None:
            head.next = l1

        # return the nodes 
        return prev.next  # if we return 'head' it will be [4,4] 
        


            
          
        
# @lc code=end

