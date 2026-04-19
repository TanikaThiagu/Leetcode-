class Solution(object):
    def deleteDuplicates(self, head):
        dummy = ListNode(0)
        dummy.next = head
        
        prev = dummy
        curr = head
        
        while curr:
            # Check if it's a duplicate sequence
            if curr.next and curr.val == curr.next.val:
                # Skip all nodes with this value
                while curr.next and curr.val == curr.next.val:
                    curr = curr.next
                prev.next = curr.next  # remove all duplicates
            else:
                prev = prev.next  # move prev if no duplicate
            
            curr = curr.next
        
        return dummy.next