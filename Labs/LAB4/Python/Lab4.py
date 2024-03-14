



class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
         
def invertTree(root):
     NULL=None
        
     if(root==NULL):
        
            return NULL
        
     if(root.left!=NULL):
        
            invertTree(root.left)
        
     if(root.right!=NULL):
        
           invertTree(root.right)
        
     temp = root.left
     root.left = root.right
     root.right=temp
     return root

def printFUNC(root):
    print(root.val, end="")
    print(" ", end="")
    if(root.left!=None):
        printFUNC(root.left)
    if(root.right!=None):
        printFUNC(root.right) 

        
      


root = TreeNode(1,TreeNode(2,TreeNode(3),TreeNode(4)), TreeNode(8,TreeNode(5),TreeNode(6)))

printFUNC(root)
root = invertTree(root)
print("")
print("INVERTED TREE")
printFUNC(root)
