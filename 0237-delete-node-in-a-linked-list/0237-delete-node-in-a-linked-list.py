class Solution(object):
    def deleteNode(self, node):
        # Copy value from next node
        node.val = node.next.val
        
        # Bypass the next node
        node.next = node.next.next