
class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right

def isValidBST(root):
        prev = 0
        def inorder(root):
            nonlocal prev
            if not root:
                return True
            if not (inorder(root.left) and prev < root.val):
                return False
            prev = root.val
            return inorder(root.right)
        return inorder(root)


#root = TreeNode(1,TreeNode(2,TreeNode(3),TreeNode(4)), TreeNode(8,TreeNode(5),TreeNode(6)))
root = TreeNode(4,TreeNode(3, TreeNode(1),None), TreeNode(8,TreeNode(5),TreeNode(9)))
print(isValidBST(root))
