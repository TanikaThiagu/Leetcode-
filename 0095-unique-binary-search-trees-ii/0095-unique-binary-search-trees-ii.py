# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution(object):
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[Optional[TreeNode]]
        """

        def build(start, end):
            # If no numbers left, return [None]
            if start > end:
                return [None]

            all_trees = []

            # Try every number as root
            for root_val in range(start, end + 1):

                # Generate all possible left and right subtrees
                left_trees = build(start, root_val - 1)
                right_trees = build(root_val + 1, end)

                # Combine each left and right subtree with root
                for left in left_trees:
                    for right in right_trees:
                        root = TreeNode(root_val)
                        root.left = left
                        root.right = right
                        all_trees.append(root)

            return all_trees

        return build(1, n)
        