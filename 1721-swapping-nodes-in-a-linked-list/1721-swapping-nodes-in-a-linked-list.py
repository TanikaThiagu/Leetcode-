class Solution(object):
    def swapNodes(self, head, k):
        # Step 1: Find kth node from the beginning
        first = head
        for _ in range(k - 1):
            first = first.next
        
        # Step 2: Find kth node from the end
        fast = first
        second = head
        
        while fast.next:
            fast = fast.next
            second = second.next
        
        # Step 3: Swap values
        first.val, second.val = second.val, first.val
        
        return head