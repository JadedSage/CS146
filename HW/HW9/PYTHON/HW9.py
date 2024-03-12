from asyncio.windows_events import NULL
from typing import Self


class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
 
         
counter = 0


def lowestCommonAncestor(root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
    if(root.val>p.val and root.val>q.val):
        return (lowestCommonAncestor(root.left,p,q))
    if(root.val<p.val and root.val<q.val):
        return (lowestCommonAncestor(root.right,p,q))
    
    

    return root

def check(self, root: 'TreeNode'):
    if(root.val>-1000000000 and root.val<1000000000):
        counter = counter+1
        
    
    
root = TreeNode(4,TreeNode(3, TreeNode(1),NULL), TreeNode(8,TreeNode(5),TreeNode(9)))
p = root.left.left; 
q= root.right.left;

solution = lowestCommonAncestor(root,p,q)
print(solution.val)
