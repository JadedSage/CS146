//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       TreeNode root = new TreeNode(4,new TreeNode(2, new TreeNode(3),new TreeNode(4)), new TreeNode(8,new TreeNode(5),new TreeNode(6)));
        System.out.println("Normal");
        print(root);
        invertTree(root);
        System.out.println();
        System.out.println("INVERTED");
        print(root);

    }
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return null;
        }
        if(root.left!=null)
        {
            invertTree(root.left);
        }
        if(root.right!=null)
        {
            invertTree(root.right);
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right=temp;

        return root;

    }
    public static void print(TreeNode root)
    {
        System.out.print(root.val);
        System.out.print(" ");
        if(root.left!=null)
        {
            print(root.left);
        }
        if(root.right!=null)
        {
            print(root.right);
        }

    }
}
